package com.epsilon.training.springboot.mvc.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epsilon.training.springboot.mvc.model.Employee;
import com.epsilon.training.springboot.mvc.repository.EmployeeRepo;

@Controller
public class EmployeeResource {
	
	@Autowired
	private EmployeeRepo employeerepo;
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee)
	{
		employeerepo.save(employee);
		return "employee.html";
	}
	
	@RequestMapping("/getEmployees")
	public String getEmployees(Model model) {
		List<Employee> employees = (List<Employee>) employeerepo.findAll();
		model.addAttribute("employees",employees);
		return "employee1.html";
	}

}
