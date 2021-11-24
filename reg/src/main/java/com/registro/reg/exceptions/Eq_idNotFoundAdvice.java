package com.registro.reg.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@ControllerAdvice
@ResponseBody
public class Eq_idNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(Eq_idNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvise(Eq_idNotFoundException ex){
        return ex.getMessage();
    }
}
