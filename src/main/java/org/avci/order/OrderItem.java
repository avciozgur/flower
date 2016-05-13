package org.avci.order;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orderItem")
public class OrderItem {

	@Id
	private String id;
	
	private String orderId;
	private String bouquetId;
	private Integer count;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBouquetId() {
		return bouquetId;
	}
	public void setBouquetId(String bouquetId) {
		this.bouquetId = bouquetId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	

}
