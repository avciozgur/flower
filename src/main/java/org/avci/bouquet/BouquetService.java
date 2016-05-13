package org.avci.bouquet;

import java.util.List;

import org.avci.util.FlowerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BouquetService {

	private static final Logger logger = LoggerFactory.getLogger(BouquetService.class);
	
	@Autowired
	private BouquetRepo bouquetRepo;
	
	public Bouquet saveBouquet(Bouquet b) {
		//b.setInsertDate(new Date());
		return bouquetRepo.save(b);
	}
	
	public Bouquet updateBouquet(Bouquet b) {
		//b.setInsertDate(new Date());
		return bouquetRepo.save(b);
	}
	
	public void deleteBouquet(String name) {
		bouquetRepo.delete(name);
	}
	
	public List<Bouquet> findAllBouquets() {
		Iterable<Bouquet> i = bouquetRepo.findAll();
		return FlowerUtil.makeList(i);
	}
	
	public Bouquet findByName(String name) {
		return bouquetRepo.findOne(name);
		
	}
	
	public boolean isExists(String name) {
		return bouquetRepo.exists(name);
	}
	

}
