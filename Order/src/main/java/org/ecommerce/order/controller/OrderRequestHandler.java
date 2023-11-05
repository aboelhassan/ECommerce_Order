package org.ecommerce.order.controller;

import java.util.function.Consumer;

import org.ecommerce.order.domain.Order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component("OrderRequestHandler")
public class OrderRequestHandler implements Consumer<Order> {

	Logger logger=LoggerFactory.getLogger(OrderRequestHandler.class);
	
	
	@Override
	public void accept(Order t) {
		logger.info("order request handler starting ");
		
	}

}
