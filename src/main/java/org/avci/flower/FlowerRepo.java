package org.avci.flower;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepo extends CrudRepository<Flower,String> {

}
