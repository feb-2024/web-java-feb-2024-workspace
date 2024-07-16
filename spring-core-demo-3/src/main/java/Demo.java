import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import config.AppConfig;
import mybeans.Employee;
import mybeans.Student;

public class Demo {

	public static void main(String[] args) {
		Student student1 = new Student(4001, "Chitra Raj", 55);
		System.out.println(student1);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2);
		
		Employee employee1 = context.getBean("emp", Employee.class);
		System.out.println(employee1);
	}

}
