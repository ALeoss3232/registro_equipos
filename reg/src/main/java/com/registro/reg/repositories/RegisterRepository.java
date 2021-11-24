package com.registro.reg.repositories;
import com.registro.reg.models.Register;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface RegisterRepository extends MongoRepository <Register, String> {
    List<Register> findByUser (String user);
}
