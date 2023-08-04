package com.asesofware.test.java.repository;

import com.asesofware.test.java.model.Mechanic;
import com.asesofware.test.java.model.enums.StatusMechanic;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MechanicRepository extends JpaRepository<Mechanic, UUID> {

    Boolean existsByDocumentTypeAndDocumentId( String documentType, String document );

    @Modifying
    @Query(value = "{call sp_create_mechanic(:uuid, :createdAt, :lastModifiedAt, :documentType," +
            ":documentId, :firstName, :secondName, :lastName, :cellphone, :address, :email, :status)}", nativeQuery = true)
    void createMechanic( UUID uuid, LocalDateTime createdAt, LocalDateTime lastModifiedAt, String documentType,
                         String documentId, String firstName, String secondName, String lastName, String cellphone,
                         String address, String email, String status );

    Page<Mechanic> findAllByStatus( StatusMechanic mechanic, Pageable pageable );
}
