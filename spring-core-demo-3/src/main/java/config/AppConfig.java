package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mybeans.Address;
import mybeans.Employee;
import mybeans.Student;

@Configuration
public class AppConfig {
	
	@Bean(name = "student")
	public Student requestStudent() {
		return new Student(3001, "Prakash Raj", 60);
	}
	
	@Bean(name="address")
	public Address getAddress() {
		return new Address(2020, "Chennai", "Tamil Nadu");
	}

	@Bean(name="emp")
	public Employee getEmployee(Address address) {
		return new Employee(5050, "Chris Tucker", address);
	}
}
