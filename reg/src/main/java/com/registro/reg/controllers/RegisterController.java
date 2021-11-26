package com.registro.reg.controllers;


import com.registro.reg.exceptions.EqidNotFoundException;
import com.registro.reg.models.Register;
import com.registro.reg.models.Usuarios;
import com.registro.reg.repositories.RegisterRepository;
import com.registro.reg.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private final RegisterRepository registerRepository;
    private final UsuarioRepository usuarioRepository;



    public RegisterController(RegisterRepository registerRepository,UsuarioRepository usuarioRepository) {
        this.registerRepository = registerRepository;
        this.usuarioRepository = usuarioRepository;

    }



    @GetMapping("/register/{eqid}")
    Register getRegister(@PathVariable String eqid) {
        return registerRepository.findById(eqid).orElseThrow(() -> new EqidNotFoundException("No se encontro el equipo: " + eqid));
    }

    @PostMapping("/register")
    Register newRegister(@RequestBody Register eqid){
        return registerRepository.save(eqid);
    }

    @GetMapping("/usuarios/{eqid}")
    Usuarios getUsuarios(@PathVariable String eqid) {
        return usuarioRepository.findById(eqid).orElseThrow(() -> new EqidNotFoundException("No se encontro el equipo: " + eqid));
    }

    @PostMapping("/usuarios")
    Usuarios newUsuarios(@RequestBody Usuarios eqid){
        return usuarioRepository.save(eqid);
    }


}
