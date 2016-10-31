package com.tameen.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.tameen.model.Employee;
import com.tameen.service.EmployeeService;



@Component("empBean")
public class EmployeeController implements Serializable {
	private static final long serialVersionUID = 1L;
	private Employee employee = new Employee();

	@Autowired
	private EmployeeService empService;

	public Employee getEmployee() {
		employee = empService.findEmployeeById(1L);
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
