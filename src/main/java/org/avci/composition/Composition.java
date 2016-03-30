package org.avci.composition;

import java.math.BigDecimal;

public class Composition {

	private Integer pId;
	
	private String name;
	private String type;
	private String size;
	private String description;
	private BigDecimal price;
	private BigDecimal cost;
	private Boolean available;
	private String compositionImageUrl;
	
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompositionImageUrl() {
		return compositionImageUrl;
	}
	public void setCompositionImageUrl(String compositionImageUrl) {
		this.compositionImageUrl = compositionImageUrl;
	}

}
