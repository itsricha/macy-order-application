package com.zensar.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.training.dto.EmployeeDTO;
import com.zensar.training.entity.EmployeeDAO;
import com.zensar.training.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public String saveEmployeeInfo(EmployeeDTO employee) {
		EmployeeDAO dao = new EmployeeDAO();
		dao.setDepart(employee.getDepart());
		dao.setId(employee.getId());
		dao.setName(employee.getName());
		dao.setPhone(employee.getPhone());
		employeeRepository.save(dao);
		return "Record saved successfully";
	}

	public EmployeeDTO getEmployee(int id) {
		EmployeeDAO dao = employeeRepository.findById(id).get();
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setDepart(dao.getDepart());
		dto.setId(dao.getId());
		dto.setName(dao.getName());
		dto.setPhone(dao.getPhone());
		return dto;
	}

}
