package Core.Comparable;


//Natural comparison implemented by comparable
public class Employee implements Comparable<Employee>{

	int id;
	String name;
	int salary;
	Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		//comparing using salary
		//return this.salary-o.salary;
		
		
		//comparing using PIN number of the address
		if (this.getAddress().getPin()> o.getAddress().getPin())
		return 1;
		else if(this.getAddress().getPin()< o.getAddress().getPin())
			return -1;
		else return 0;
	}
	
	
}
