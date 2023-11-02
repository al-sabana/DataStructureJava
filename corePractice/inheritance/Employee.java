package corePractice.inheritance;

 public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee() {

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

	void raiseSalary(double percent) {
		salary += salary * percent / 100;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("sabnu", 1300);
		emp.raiseSalary(30);
		System.out.println(emp.getSalary());
		Manager m1 = new Manager("sabin", 400, 2.0);
		m1.getSalary();
	}
	

	

}

 class Manager extends Employee {
	double bonus;

	public Manager(String name, int salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public Manager() {

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	

}
