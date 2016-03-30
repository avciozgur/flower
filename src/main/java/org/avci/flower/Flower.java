package org.avci.flower;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flowers")
public class Flower {

	@Id
	private String id;
	
	@Indexed(unique = true)
	private String name;
	
	private String description;
	private String flowerImageUrl;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFlowerImageUrl() {
		return flowerImageUrl;
	}
	public void setFlowerImageUrl(String flowerImageUrl) {
		this.flowerImageUrl = flowerImageUrl;
	}

}
