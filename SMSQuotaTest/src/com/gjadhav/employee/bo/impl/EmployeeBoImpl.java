package com.gjadhav.employee.bo.impl;

import com.gjadhav.employee.bo.EmployeeBo;
import com.gjadhav.employee.dao.EmployeeDao;
import com.gjadhav.employee.model.Employee;



public class EmployeeBoImpl implements EmployeeBo{
	
	EmployeeDao employeeDao;
	


	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void persistEmployee(Employee emp) {
		employeeDao.save(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.update(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeDao.delete(emp);
		
	}

	@Override
	public Employee findByEmployeeCode(int stockCode) {
		
		return employeeDao.findByEmployeeCode(stockCode);
	}

	@Override
	public Employee findBySalary(int salary) {
		
		return employeeDao.findBySalary(salary);
	}
}
