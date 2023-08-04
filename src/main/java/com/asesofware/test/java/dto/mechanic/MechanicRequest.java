package com.asesofware.test.java.dto.mechanic;

import com.asesofware.test.java.model.enums.StatusMechanic;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MechanicRequest {
    @NotEmpty(message = "Document Type cannot be empty")
    private String documentType;
    @NotEmpty(message = "Document Id cannot be empty")
    private String documentId;
    private String firstName;
    private String secondName;
    private String lastName;
    private String cellphone;
    private String address;
    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @NotEmpty(message = "Email cannot be empty")
    private String email;
    private StatusMechanic status;
}
