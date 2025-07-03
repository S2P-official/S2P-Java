package com.s2p.FCT.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.s2p.FCT.entity.AddInventory;

@Repository
public interface AddInventoryRepository extends JpaRepository<AddInventory, Long>{

}
