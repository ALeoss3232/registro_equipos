package com.registro.reg.repositories;
import com.registro.reg.models.Software;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface SoftwareRepository extends MongoRepository <Software, String> {
    List<Software> findByeqid (String eqid);

}
