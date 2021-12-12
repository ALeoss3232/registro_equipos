package com.registro.reg.controllers;

import com.registro.reg.exceptions.EqidNotFoundException;
import com.registro.reg.models.Contabilidad;
import com.registro.reg.models.Register;
import com.registro.reg.models.Softwarepc;
import com.registro.reg.models.Usuarios;
import com.registro.reg.repositories.ContabilidadRepository;
import com.registro.reg.repositories.RegisterRepository;
import com.registro.reg.repositories.SoftwarepcRepository;
import com.registro.reg.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class RegisterController {

    private final RegisterRepository registerRepository;
    private final UsuarioRepository usuarioRepository;
    private final ContabilidadRepository contabilidadRepository;
    private final SoftwarepcRepository softwarepcRepository;

    public RegisterController(RegisterRepository registerRepository,UsuarioRepository usuarioRepository,ContabilidadRepository contabilidadRepository,SoftwarepcRepository softwarepcRepository) {
        this.registerRepository = registerRepository;
        this.usuarioRepository = usuarioRepository;
        this.softwarepcRepository = softwarepcRepository;
        this.contabilidadRepository = contabilidadRepository;
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

    @GetMapping("/contabilidad/{eqid}")
    Contabilidad getContabilidad(@PathVariable String eqid) {
        return contabilidadRepository.findById(eqid).orElseThrow(() -> new EqidNotFoundException("No se encontro el equipo: " + eqid));
    }

    @PostMapping("/contabilidad")
    Contabilidad newContabilidad(@RequestBody Contabilidad eqid){
        return contabilidadRepository.save(eqid);
    }

    @GetMapping("/softwarepc/{eqid}")
    Softwarepc getSoftawarepc(@PathVariable String eqid) {
        return softwarepcRepository.findById(eqid).orElseThrow(() -> new EqidNotFoundException("No se encontro el equipo: " + eqid));
    }

    @PostMapping("/softwarepc")
    Softwarepc newSoftwarepc(@RequestBody Softwarepc eqid){
        return softwarepcRepository.save(eqid);
    }



}
