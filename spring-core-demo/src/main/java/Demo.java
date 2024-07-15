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
		
		// verifying singleton scope
		System.out.println("Verifying singleton scope...");
		Student student4 = context.getBean("stud", Student.class);
		System.out.println("student4 : " + student4);
		
		Student student5 = context.getBean("stud", Student.class);
		System.out.println("student5 : " + student5);
		
		student4.setStudName("TestingSingleton");
		System.out.println("student4 : " + student4);
		System.out.println("student5 : " + student5);
		
		// verifying prototype scope
		System.out.println("Verifying prototype scope...");
		Student student6 = context.getBean("student", Student.class);
		System.out.println("student6 : " + student6);
		
		Student student7 = context.getBean("student", Student.class);
		System.out.println("student7 : " + student7);
		
		student6.setStudMark(-35);
		System.out.println("student6 : " + student6);
		System.out.println("student7 : " + student7);
	}

}
