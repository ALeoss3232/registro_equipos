package com.registro.reg.repositories;

import com.registro.reg.models.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UsuarioRepository extends MongoRepository <Usuarios, String> {
    List<Usuarios> findByeqid (String eqid);
}
