package com.asesofware.test.java.service.mechanic;


import com.asesofware.test.java.dto.mechanic.MechanicRequest;
import com.asesofware.test.java.model.Mechanic;
import org.springframework.data.domain.Page;

public interface MechanicService {
    void create( MechanicRequest mechanicRequest );

    Page<Mechanic> getMechanics( int page, int size );

}
