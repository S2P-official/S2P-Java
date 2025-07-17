package com.s2p.FCT.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.s2p.FCT.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>  {

}
