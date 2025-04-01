package com.dan.shoe.shoe;

import com.dan.shoe.perfume.models.enums.OrderStatus;
import com.dan.shoe.perfume.repositories.OrderRepository;
import com.dan.shoe.perfume.services.OrderService;
import com.dan.shoe.perfume.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShoeApplicationTests {
	@Autowired
	private ProductService productService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderRepository orderRepository;

	@Test
	void contextLoads() {
		System.out.println(orderRepository.findByStatus(OrderStatus.DONE).size());
	}

}
