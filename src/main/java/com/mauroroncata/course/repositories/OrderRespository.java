package com.mauroroncata.course.repositories;

import com.mauroroncata.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order, Long> {

}
