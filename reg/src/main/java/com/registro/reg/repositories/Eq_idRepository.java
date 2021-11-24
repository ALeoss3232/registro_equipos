package com.registro.reg.repositories;

import com.registro.reg.models.Register;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface Eq_idRepository extends MongoRepository<Register, String> {
    List<Register> findByeqid (String eqid);
}
