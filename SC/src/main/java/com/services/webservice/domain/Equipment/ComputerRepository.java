package com.services.webservice.domain.Equipment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long>{
	List<Computer> findByEquipNum(String equipNum);
}