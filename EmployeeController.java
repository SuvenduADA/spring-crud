package com.ada.ecs.underwriting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import com.ada.ecs.underwriting.repo.IEmployeeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by Suvendu Pramanick on 20-04-2019.
 */


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private IEmployeeRepository employeeRepository;
	
	 public EmployeeController() {
	        super();
	    }
	 @Autowired
	 public EmployeeController(final IEmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }
	    
	 @ApiOperation(httpMethod = "GET", value = "GET Employee ID", consumes = "application/json")
	 @RequestMapping(value="/{USER_ID}",method = RequestMethod.GET)
		public int getEmpIDByUserName(@PathVariable(value = "USER_ID")String USER_ID) {
			return employeeRepository.getEmpIDByUserName(USER_ID);
		}
	 
	
}
