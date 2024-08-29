package interfaceExample;

public class Circle extends Shape implements Area{
	int radius;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		this.area=(float) (Area.pi*radius*radius);
	}
	public void display() {
		System.out.println("Area of ircle is "+area);
	}

}
