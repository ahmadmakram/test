package com.tameen.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tameen.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService, Serializable {
	private static final long serialVersionUID = 1L;
	private List<Employee> empList = new ArrayList<Employee>();

	public EmployeeServiceImpl() {
		Employee emp1 = new Employee();
		emp1.setEmpId(1L);
		emp1.setFirstName("Huong");
		emp1.setLastName("Nguyen");
		Employee emp2 = new Employee();
		emp2.setEmpId(2L);
		emp2.setFirstName("Khang");
		emp2.setLastName("Le");
		empList.add(emp1);
		empList.add(emp2);
	}

	public Employee findEmployeeById(long empId) {
		for (Employee emp : empList) {
			if (emp.getEmpId() == empId) {
				return emp;
			}
		}
		return null;
	}
}
