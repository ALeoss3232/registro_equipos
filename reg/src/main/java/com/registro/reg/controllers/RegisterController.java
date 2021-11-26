package com.registro.reg.controllers;


import com.registro.reg.exceptions.UserNotFoundException;
import com.registro.reg.models.Register;

import com.registro.reg.repositories.RegisterRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private final RegisterRepository registerRepository;



    public RegisterController(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;

    }



    @GetMapping("/register/{user}")
    Register getRegister(@PathVariable String user) {
        return registerRepository.findById(user).orElseThrow(() -> new UserNotFoundException("No se encontro una cuenta con el username: " + user));
    }

    @PostMapping("/register")
    Register newRegister(@RequestBody Register user){
        return registerRepository.save(user);
    }




}
