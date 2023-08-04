package com.asesofware.test.java.model;

import com.asesofware.test.java.model.abstracts.BaseModel;
import com.asesofware.test.java.model.enums.StatusMechanic;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mechanic")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mechanic extends BaseModel {
    @Column(nullable = false)
    private String documentType;
    @Column(unique = true, nullable = false)
    private String documentId;
    @Column(nullable = false)
    private String firstName;
    private String secondName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String cellphone;
    private String address;
    @Column(nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    private StatusMechanic status;
}
