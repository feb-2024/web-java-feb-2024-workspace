package creationaldesignpattern.builderpattern;

public class Demo {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		emp1.setEmpId(101);
		emp1.setEmpName("abc");
		emp1.setEmpAddress("Mumbai");
		System.out.println(emp1);
		
		// we can also create the employee object with method chaining design pattern
		// method chaining design pattern does not work efficiently for concurrent access
		// so we can go for builder pattern
		Employee2 emp2 = new Employee2();
		emp2.setEmpId(102).setEmpName("xyz").setEmpAddress("Chennai");
		System.out.println(emp2);
		
		// creating employee object using builder pattern
		Employee3 emp3 = Employee3.Builder.newInstance()
											.setId(103)
											.setName("lmn")
											.setAddress("Bangalore")
											.build();
		System.out.println(emp3);
	}
}
