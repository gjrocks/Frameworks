package com.gjadhav.employee.dao;

import com.gjadhav.employee.model.Employee;



public interface EmployeeDao {
	
	void save(Employee stock);
	
	void update(Employee stock);
	
	void delete(Employee stock);
	
	Employee findByEmployeeCode(int stockCode);

	Employee findBySalary(int salary);
}
