package com.tameen.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import com.tameen.model.Department;
import com.tameen.model.Employee;

@ManagedBean(name = "empBean11")
public class EmployeeController1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private Employee employee = new Employee();

	public Employee getEmployee() {
		employee.setEmpId(1L);
		employee.setDepartment(new Department());
		employee.setFirstName("Ant");
		employee.setLastName("Team");
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
