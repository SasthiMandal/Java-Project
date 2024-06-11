package com.sasthi.employeeregistration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sasthi.employeeregistration.constant.AppConstant;
import com.sasthi.employeeregistration.dto.EmployeeDto;
import com.sasthi.employeeregistration.model.EmployeeModel;
import com.sasthi.employeeregistration.service.EmployeeService;

@Controller
@RequestMapping(value = AppConstant.EMPLOYEE_API)
@ResponseBody
public class EmployeeController {

	//field injection......!
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = AppConstant.SAVE_EMPLOYEE)
	public void saveEmployee(@RequestBody EmployeeDto dto) {
		employeeService.saveEmployee(dto);
	}

	@PostMapping(value = AppConstant.SAVE_ALL)
	public void saveAll(@RequestBody List<EmployeeModel> listEmployee) {
		employeeService.saveAll(listEmployee);
	}

	@PutMapping(value = AppConstant.PUT_UPDATE)
	public void putUpdate(@PathVariable Long id) {
		employeeService.putUpdate(id);
	}

	@PatchMapping(value = AppConstant.PATCH_UPDATE)
	public void patchUpdate(@PathVariable Long id) {
		employeeService.patchUpdate(id);
	}

	@DeleteMapping(value = AppConstant.DELETE_BY_ID)
	public void deleteById(@PathVariable Long id) {
		employeeService.deleteById(id);
	}

	@DeleteMapping(value = AppConstant.DELETE_ALL)
	public void deleteAll() {
		employeeService.deleteAll();
	}

	@GetMapping(value = AppConstant.FIND_BY_ID)
	public @ResponseBody Optional<EmployeeModel> findById(@PathVariable Long id) {
		return employeeService.findById(id);
	}

	@GetMapping(value = AppConstant.FIND_BY_NAME)
	public @ResponseBody List<EmployeeModel> findByName(@PathVariable String name) {
		return employeeService.findByName(name);
	}

	@GetMapping(value = AppConstant.FIND_ALL)
	public @ResponseBody List<EmployeeModel> findAll() {
		return employeeService.findAll();
	}

	@GetMapping(value = AppConstant.FIND_BY_NAME_AND_ADDRESS)
	public @ResponseBody List<EmployeeModel> findByNameAndAddress(@PathVariable String name,
			@PathVariable String address) {
		return employeeService.findByNameAndAddress(name, address);
	}

	@GetMapping(value = AppConstant.FIND_BY_NAME_OR_ADDRESS)
	public @ResponseBody List<EmployeeModel> findByNameOrAddress(@PathVariable String name,
			@PathVariable String address) {
		return employeeService.findByNameOrAddress(name, address);
	}

	@GetMapping(value = AppConstant.FIND_BY_AGE_ORDER_BY_NAME_ASC)
	public @ResponseBody List<EmployeeModel> findByAgeOrderByNameAsc(@PathVariable String age) {
		return employeeService.findByAgeOrderByNameAsc(age);
	}

	@GetMapping(value = AppConstant.FIND_BY_AGE_ORDER_BY_NAME_DESC)
	public @ResponseBody List<EmployeeModel> findByAgeOrderByNameDesc(@PathVariable String age) {
		return employeeService.findByAgeOrderByNameDesc(age);
	}
}
