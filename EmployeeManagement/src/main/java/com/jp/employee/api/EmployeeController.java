/**
 * 
 */
package com.jp.employee.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is responsible for the employee api operations.
 * 
 * @author chand
 *
 */
@RestController
@RequestMapping("emp")
public class EmployeeController {
	
	@GetMapping(path = "/getEmployee/{id}" ,produces = "application/json")
	public EmployeeModel  getEmployee(@PathVariable("id") int ids) {
		
		EmployeeModel employeeModel=new EmployeeModel();
		employeeModel.setEmployeeId(ids);
		employeeModel.setEmpName("sneh");
		employeeModel.setDesignation("Imam");
		return employeeModel;
		
	}
	

}
