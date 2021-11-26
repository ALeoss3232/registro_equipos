package com.registro.reg.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@ControllerAdvice
@ResponseBody
public class EqidNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(EqidNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(EqidNotFoundException ex){
        return ex.getMessage();
    }
}
