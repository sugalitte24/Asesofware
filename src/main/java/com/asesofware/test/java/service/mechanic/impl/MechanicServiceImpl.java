package com.asesofware.test.java.service.mechanic.impl;

import com.asesofware.test.java.dto.mechanic.MechanicMapper;
import com.asesofware.test.java.dto.mechanic.MechanicRequest;
import com.asesofware.test.java.exceptions.MechanicAlreadyExist;
import com.asesofware.test.java.model.Mechanic;
import com.asesofware.test.java.model.enums.StatusMechanic;
import com.asesofware.test.java.repository.MechanicRepository;
import com.asesofware.test.java.service.mechanic.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MechanicServiceImpl implements MechanicService {

    @Autowired
    private MechanicRepository mechanicRepository;
    @Autowired
    private MechanicMapper mechanicMapper;

    @Override
    @Transactional
    public void create( MechanicRequest mechanicRequest ) {
        if (validateExistMechanic(mechanicRequest)) {
            throw new MechanicAlreadyExist("Mecánico ya existe.");
        }
        try {
            var model = mechanicMapper.toModelFromRequest(mechanicRequest);
            mechanicRepository.createMechanic(model.uuid, model.createdAt, model.lastModifiedAt, model.getDocumentType().toString(),
                    model.getDocumentId(), model.getFirstName(), model.getSecondName(), model.getLastName(),
                    mechanicRequest.getCellphone(), model.getAddress(), model.getEmail(), model.getStatus().toString());
        } catch (Exception e) {
            e.getCause();
        }
    }

    public Boolean validateExistMechanic( MechanicRequest mechanicRequest ) {
        return mechanicRepository.existsByDocumentTypeAndDocumentId(mechanicRequest.getDocumentType().toString(), mechanicRequest.getDocumentId());
    }

    @Override
    public Page<Mechanic> getMechanics( int page, int size) {
        Pageable paging = PageRequest.of(page, size);
        return mechanicRepository.findAllByStatus(StatusMechanic.enabled, paging);
    }
}
