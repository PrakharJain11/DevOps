package com.prakharjain.dockerex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prakharjain.dockerex.exceptionHandling.ResourceNotFoundException;
import com.prakharjain.dockerex.modal.Employee;
//import com.prakharjain.dockerex.service.EmployeeService;
import com.prakharjain.dockerex.service.EmployeeServiceException;

@RestController
public class EmployeeController {
	
	/*@Autowired
	EmployeeService employeeService;
*/
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public String sayHi()
	{
		return "Hi";
	}
	
   /* //Happy path, an employee is returned as response
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee getEmpl() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee emp = employeeService.getEmployee();

			if (emp == null) {
				throw new ResourceNotFoundException("Employee not found");
			}
			return emp;
		} catch (EmployeeServiceException e) {
			throw new EmployeeServiceException("Internal Server Exception while getting exception");
		}
	}

    //no employee found so ResourceNotFoundException is thrown
	@RequestMapping(value = "/employee2", method = RequestMethod.GET)
	public Employee getEmp2() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee emp = employeeService.getEmployeeNull();
			if (emp == null) {
				throw new ResourceNotFoundException("Employee not found");
			}

			return emp;
		} catch (EmployeeServiceException e) {
			throw new EmployeeServiceException("Internal Server Exception while getting exception");
		}
	}

    //Some exception is thrown by service layer
	@RequestMapping(value = "/employee3", method = RequestMethod.GET)
	public Employee getEmp3() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee emp = employeeService.getEmployeeException();
			if (emp == null) {
				throw new ResourceNotFoundException("Employee not found");
			}
			return emp;
		} catch (EmployeeServiceException e) {
			throw new EmployeeServiceException("Internal Server Exception while getting exception");
		}
	}
*/	
}
