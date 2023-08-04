package com.asesofware.test.java.dto.mechanic;


import com.asesofware.test.java.dto.BaseModelDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MechanicDto extends BaseModelDto {
    private String documentType;
    private String documentId;
    private String firstName;
    private String secondName;
    private String lastName;
    private String cellphone;
    private String address;
    private String email;
    private String status;
}
