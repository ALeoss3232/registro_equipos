package com.registro.reg.controllers;


import com.registro.reg.exceptions.EqidNotFoundException;
import com.registro.reg.models.Register;
import com.registro.reg.models.Usuarios;
import com.registro.reg.models.Software;
import com.registro.reg.models.Contabilidad;
import com.registro.reg.repositories.RegisterRepository;
import com.registro.reg.repositories.UsuarioRepository;
import com.registro.reg.repositories.SoftwareRepository;
import com.registro.reg.repositories.ContabilidadRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private final RegisterRepository registerRepository;
    private final UsuarioRepository usuarioRepository;
    private final SoftwareRepository softwareRepository;
    private final ContabilidadRepository contabilidadRepository;

    public RegisterController(RegisterRepository registerRepository,UsuarioRepository usuarioRepository,ContabilidadRepository contabilidadRepository,SoftwareRepository softwareRepository) {
        this.registerRepository = registerRepository;
        this.usuarioRepository = usuarioRepository;
        this.softwareRepository = softwareRepository;
        this.contabilidadRepository=contabilidadRepository;
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
        return contabilidadRepository.findById(eqid).orElseThrow(() -> new EqidNotFoundException("No se encontro el equipo: "+ eqid));
    }

    @PostMapping("/contabilidad")
    Contabilidad newContabilidad(@RequestBody Contabilidad eqid){
        return contabilidadRepository.save(eqid);
    }

    @GetMapping("/software/{eqid}")
    Software getSoftware(@PathVariable String eqid) {
        return softwareRepository.findById(eqid).orElseThrow(() -> new EqidNotFoundException("No se encontro el equipo: " + eqid));
    }

    @PostMapping("/software")
    Software newSoftware(@RequestBody Software eqid){
        return softwareRepository.save(eqid);
    }

}
