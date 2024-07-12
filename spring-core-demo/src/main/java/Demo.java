import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.Employee;
import mybeans.Student;

public class Demo {

	public static void main(String[] args) {
		Student student1 = new Student(1001, "abc", 50);
		System.out.println(student1);

		ApplicationContext context = new ClassPathXmlApplicationContext("anyName.xml");
		//in the above line the spring core container gets created by taking the xml file 
		//and intializing the beans configured in the xml file 
		
		Student student2 = context.getBean("stud", Student.class);
		System.out.println(student2);
		
		Student student3 = context.getBean("student", Student.class);
		System.out.println(student3);
		
		Employee employee1 = context.getBean("emp", Employee.class);
		System.out.println(employee1);
	}

}
