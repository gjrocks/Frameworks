package com.gjadhav.employee.bo;

import com.gjadhav.employee.model.Employee;



public interface EmployeeBo {
	
	void persistEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	void deleteEmployee(Employee emp);
	
	Employee findByEmployeeCode(int stockCode);
	
	Employee findBySalary(int salary);

}
