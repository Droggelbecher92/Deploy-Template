package de.neuefische.backend.repo;

import de.neuefische.backend.model.Something;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomethingRepo extends MongoRepository<Something,String> {
}
