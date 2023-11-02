package corePractice.abstractClass;

abstract class Shapes {
	private int length;
	private int breadth;

	Shapes(int l, int b) {
		this.length = l;
		this.breadth = b;
	}

	Shapes() {

	}

	public int getl() {
		return this.length;
	}

	public int getb() {
		return this.breadth;
	}

	abstract int area();

}

class Square extends Shapes {

	Square(int l) {
		super(l, l);
	}

	@Override
	int area() {

		return super.getl() * getl();
	}

}

class Rectangle extends Shapes {

	Rectangle(int l, int b) {
		super(l, b);
	}

	@Override
	int area() {
		return super.getl() * getb();
	}

}

public class AbstractClassDemo {

	public static void main(String[] args) {
		
       
		Square s1 = new Square(30);
		
		System.out.println("The area of square is : "+s1.area());
	
	}

}
