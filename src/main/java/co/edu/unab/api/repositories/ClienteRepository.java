package co.edu.unab.api.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.api.models.ClienteModel;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteModel , String> {
    
      ArrayList<ClienteModel> findByNombre(String nombre);

      //Consultar x puntos, los clientes mayores o iguales a determinado número de puntos.
      
      
      
}

