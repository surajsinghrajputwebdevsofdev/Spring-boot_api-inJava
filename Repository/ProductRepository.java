package org.surajjavaapi.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.surajjavaapi.demo.models.Product; 
@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    
}

