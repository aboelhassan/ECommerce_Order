package org.ecommerce.order.domain;

import java.util.Date;

public class Order {

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	private Long id;
	private Date orderDate;
	
}
