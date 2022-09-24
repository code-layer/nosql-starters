package in.datalayer.starters;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends MongoRepository<College,Integer> {
}
