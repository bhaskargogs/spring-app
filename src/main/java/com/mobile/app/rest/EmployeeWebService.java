package com.mobile.app.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mobile.app.controller.model.ui.Employee;

@Controller
public class EmployeeWebService {

	private Map<String,Employee> employeStore = new HashMap<>();
	
	public EmployeeWebService(){
		Employee e2 = new Employee("SY1002","Bhaskar Gogoi","session2@synergistic.com","Mean Stack Intern",25,"bhas.jpg");
		Employee e1 = new Employee("SY1001","Harish Kumar","session1@synergisticit.com","Mean Stack Intern",21,"hari.jpg");
		Employee e3 = new Employee("SY1003", "Md Nahid", "session3@synergisticit.com", "Mean Stack Developer", 28, "nahid.jpg");
		Employee e4 = new Employee("SY1004", "Prateek Dhage", "session4@synergistic.com", "", 27, "prateek.jpg");
		employeStore.put("session1@synergisticit.com", e1);
		employeStore.put("session2@synergisticit.com", e2);
		employeStore.put("session3@synergisticit.com", e3);
		employeStore.put("session4@synergisticit.com", e4);
	}
	
	@RequestMapping(value="/employeeDetail",method=RequestMethod.GET)
	@ResponseBody public Employee addEmployee(@RequestParam("email") String email){
		Employee emp = employeStore.get(email);
		return emp;
	}
}
