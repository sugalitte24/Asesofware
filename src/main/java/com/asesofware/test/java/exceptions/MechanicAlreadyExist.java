package com.asesofware.test.java.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MechanicAlreadyExist extends RuntimeException {
    private String message;

    public MechanicAlreadyExist( String msg ) {
        super(msg);
        this.message = msg;
    }
}
