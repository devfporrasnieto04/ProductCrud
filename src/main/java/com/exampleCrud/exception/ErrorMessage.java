package com.exampleCrud.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.Date;
@AllArgsConstructor
@Getter
public class ErrorMessage {
    private int statusCode;
    private Date timesTamp;
    private String message;
    private String description;

}
