package com.asesofware.test.java.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionsInfo {

    private int statusCode;
    private String message;
}
