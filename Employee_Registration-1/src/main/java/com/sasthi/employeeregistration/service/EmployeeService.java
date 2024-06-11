package com.sasthi.employeeregistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasthi.employeeregistration.dto.EmployeeDto;
import com.sasthi.employeeregistration.model.EmployeeModel;
import com.sasthi.employeeregistration.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void saveEmployee(EmployeeDto dto) {
		// TODO Auto-generated method stub
		EmployeeModel model = new EmployeeModel();
		model.setName(dto.getName());
		model.setAge(dto.getAge());
		model.setAddress(dto.getAddress());

		employeeRepository.save(model);

	}

	public void saveAll(List<EmployeeModel> listEmployee) {
		// TODO Auto-generated method stub
		employeeRepository.saveAll(listEmployee);
	}

	public void putUpdate(Long id) {
		// TODO Auto-generated method stub
		Optional<EmployeeModel> optional = employeeRepository.findById(id);
		EmployeeModel model = optional.get();
		model.setName("Rakesh");
		model.setAge("30");
		model.setAddress("Kolkata");

		employeeRepository.save(model);
	}

	public void patchUpdate(Long id) {
		// TODO Auto-generated method stub
		Optional<EmployeeModel> optional = employeeRepository.findById(id);
		EmployeeModel model = optional.get();
		model.setName("Biki");

		employeeRepository.save(model);
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll();
	}

	public Optional<EmployeeModel> findById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	public List<EmployeeModel> findByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.findByName(name);
	}

	public List<EmployeeModel> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public List<EmployeeModel> findByNameAndAddress(String name, String address) {
		// TODO Auto-generated method stub
		return employeeRepository.findByNameAndAddress(name,address);
	}

	public List<EmployeeModel> findByNameOrAddress(String name, String address) {
		// TODO Auto-generated method stub
		return employeeRepository.findByNameOrAddress(name,address);
	}

	public List<EmployeeModel> findByAgeOrderByNameAsc(String age) {
		// TODO Auto-generated method stub
		return employeeRepository.findByAgeOrderByNameAsc(age);
	}

	public List<EmployeeModel> findByAgeOrderByNameDesc(String age) {
		// TODO Auto-generated method stub
		return employeeRepository.findByAgeOrderByNameDesc(age);
	}

}
