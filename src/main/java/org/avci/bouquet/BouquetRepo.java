package org.avci.bouquet;

import java.util.List;

import org.avci.flower.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BouquetRepo extends CrudRepository<Bouquet,String> {

	List<Bouquet> findByName(String name);
}
