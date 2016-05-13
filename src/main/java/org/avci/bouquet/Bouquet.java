package org.avci.bouquet;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bouquet")
public class Bouquet implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@Indexed(unique = true)
	private String name;
	
	private String description;
	private String type;
	private String imageURL;
	private BigDecimal price;
	private boolean active; 
	private Date entryDate;
	
	
	
	public Bouquet() {
		super();
		// TODO Auto-generated constructor stub
	}



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



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getImageURL() {
		return imageURL;
	}



	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}



	public BigDecimal getPrice() {
		return price;
	}



	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public Date getEntryDate() {
		return entryDate;
	}



	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}





}
