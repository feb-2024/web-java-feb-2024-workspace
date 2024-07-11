import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.Student;

public class Demo {

	public static void main(String[] args) {
		Student student1 = new Student(1001, "abc", 50);
		System.out.println(student1);

		ApplicationContext context = new ClassPathXmlApplicationContext("anyName.xml");
		Student student2 = context.getBean("stud", Student.class);
		System.out.println(student2);
		
	}

}
