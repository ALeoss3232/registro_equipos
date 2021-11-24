package com.registro.reg.controllers;

import com.registro.reg.exceptions.Eq_idNotFoundException;
import com.registro.reg.exceptions.UserNotFoundException;
import com.registro.reg.models.Register;
import com.registro.reg.repositories.Eq_idRepository;
import com.registro.reg.repositories.RegisterRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private final RegisterRepository registerRepository;
    private final Eq_idRepository eq_idRepository;


    public RegisterController(RegisterRepository registerRepository, Eq_idRepository eq_idRepository) {
        this.registerRepository = registerRepository;
        this.eq_idRepository = eq_idRepository;
    }



    @GetMapping("/register/{user}")
    Register getRegister(@PathVariable String user) {
        return registerRepository.findById(user).orElseThrow(() -> new UserNotFoundException("No se encontro una cuenta con el username: " + user));
    }

    @GetMapping("/register/{user}/{eq_id}")
    Register getEqID(@PathVariable String eqid) {
        return eq_idRepository.findById(eqid).orElseThrow(() -> new Eq_idNotFoundException("No se encontro un equipo con el eq_id: " + eqid));

    }
    @PostMapping("/register")
    Register newRegister(@RequestBody Register user){
        return registerRepository.save(user);
    }




}
