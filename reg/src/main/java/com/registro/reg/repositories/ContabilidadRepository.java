package com.registro.reg.repositories;

import com.registro.reg.models.Contabilidad;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface ContabilidadRepository extends MongoRepository <Contabilidad,String> {
    List<Contabilidad> findByeqid (String eqid);

}
