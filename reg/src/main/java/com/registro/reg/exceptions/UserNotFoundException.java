package com.registro.reg.exceptions;


public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }


}
