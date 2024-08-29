package interfaceExample;

public class Square extends Shape implements Area{
	int side = 10 ;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		this.area=side*side;
	}
	public void display() {
		System.out.println("Area of Square is "+area);
	}

}
