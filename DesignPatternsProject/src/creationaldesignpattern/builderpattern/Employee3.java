package creationaldesignpattern.builderpattern;

// class whose object can be created using builder pattern
public class Employee3 {

	private int empId;
	private String empName;
	private String empAddress;
	
	public Employee3(Builder builder) {
		this.empId = builder.id;
		this.empName = builder.name;
		this.empAddress = builder.address;
	}
	
	public static class Builder{
		private int id;
		private String name;
		private String address;
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Employee3 build() {
			return new Employee3(this);
		}

		@Override
		public String toString() {
			return "Builder [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
	}

	@Override
	public String toString() {
		return "Employee3 [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	
}
