package com.registro.reg.repositories;
import com.registro.reg.models.Softwarepc;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SoftwarepcRepository extends MongoRepository <Softwarepc, String> {
    List<Softwarepc> findByeqid (String eqid);
}
