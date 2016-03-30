package org.avci.flower;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
public class FlowerService {

	private static final Logger logger = LoggerFactory.getLogger(FlowerService.class);
	
	@Autowired
	private FlowerRepo flowerRepo;

	public Flower addFlower(Flower f) {
		return flowerRepo.save(f);
	}
	
	public String getDesc() {

		logger.debug("getDesc() is executed!");
		return "Flower design Studio";

	}

	public String getTitle(String name) {

		logger.debug("getTitle() is executed! $name : {}", name);

		if(StringUtils.isEmpty(name)){
			return "Je Fleur de Istanbul";
		}else{
			return "Hello " + name;
		}
		
	}

}