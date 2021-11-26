package com.registro.reg.controllers;


import com.registro.reg.exceptions.EqidNotFoundException;
import com.registro.reg.models.Register;
import com.registro.reg.repositories.RegisterRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private final RegisterRepository registerRepository;



    public RegisterController(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;

    }



    @GetMapping("/register/{eqid}")
    Register getRegister(@PathVariable String eqid) {
        return registerRepository.findById(eqid).orElseThrow(() -> new EqidNotFoundException("No se encontro una cuenta con el username: " + eqid));
    }

    @PostMapping("/register")
    Register newRegister(@RequestBody Register eqid){
        return registerRepository.save(eqid);
    }




}
