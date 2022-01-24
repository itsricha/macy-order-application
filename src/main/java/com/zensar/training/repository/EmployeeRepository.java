package com.zensar.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.training.entity.EmployeeDAO;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDAO, Integer> {

}
