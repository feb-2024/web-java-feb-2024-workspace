

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mybeans.Student;
import mybeans.Employee;


public class Demo {

	public static void main(String[] args) {
		Student student1 = new Student(101, "John Smith", 25);
		System.out.println(student1);
		
		ApplicationContext context = new AnnotationConfigApplicationContext("mybeans");
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2);
		
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);

	}

}
