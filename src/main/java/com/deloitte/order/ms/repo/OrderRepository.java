package com.deloitte.order.ms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.order.ms.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{
	
		public List<Orders> findByCid(Integer custId);

}
