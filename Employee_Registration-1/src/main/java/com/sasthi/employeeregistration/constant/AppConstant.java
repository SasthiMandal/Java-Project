package com.sasthi.employeeregistration.constant;

public interface AppConstant {
	

	public static final String EMPLOYEE_INFORMATION = "empinfo1";
	public static final String EMPLOYEE_API = "/api";
	public static final String SAVE_EMPLOYEE = "/save";
	public static final String SAVE_ALL = "/saveAll";
	public static final String PUT_UPDATE = "/putUpdate/{id}";
	public static final String PATCH_UPDATE = "/patchUpdate/{id}";
	public static final String DELETE_BY_ID = "/deleteById/{id}";
	public static final String DELETE_ALL = "/deleteAll";
	public static final String FIND_BY_ID = "/findById/{id}";
	public static final String FIND_BY_NAME = "/findByName/{name}";
	public static final String FIND_ALL="/findAll";
	public static final String FIND_BY_NAME_AND_ADDRESS = "/findByNameAndAddress/{name}/{address}";
	public static final String FIND_BY_NAME_OR_ADDRESS = "/findByNameOrAddress/{name}/{address}";
	public static final String FIND_BY_AGE_ORDER_BY_NAME_ASC = "/findByAgeOrderByNameAsc/{age}";
	public static final String FIND_BY_AGE_ORDER_BY_NAME_DESC = "/findByAgeOrderByNameDesc/{age}";

}
