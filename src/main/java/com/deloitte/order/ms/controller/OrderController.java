package com.deloitte.order.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.order.ms.entity.Orders;
import com.deloitte.order.ms.repo.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderRepository orderRepository;
	
	@GetMapping("/getOrders")
	public ResponseEntity<List<Orders>> getOrders(){
		List<Orders> orderList = orderRepository.findAll();
		return new ResponseEntity<List<Orders>>(orderList,HttpStatus.OK);		
	}
	
	@GetMapping("/getOrder/{cid}")
	public ResponseEntity<List<Orders>> getOrder(@PathVariable("cid") Integer cid){
		List<Orders> orderList = orderRepository.findByCid(cid);
		return new ResponseEntity<List<Orders>>(orderList,HttpStatus.OK);		
	}
	
}
