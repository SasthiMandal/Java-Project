package com.sasthi.employeeregistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sasthi.employeeregistration.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{

	List<EmployeeModel> findByName(String name);

	List<EmployeeModel> findByNameAndAddress(String name, String address);

	List<EmployeeModel> findByNameOrAddress(String name, String address);

	List<EmployeeModel> findByAgeOrderByNameAsc(String age);

	List<EmployeeModel> findByAgeOrderByNameDesc(String age);

}
