package interfaceExample;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		sq.side=10;
		sq.area();
		sq.display();
		
		
		Circle c=new Circle();
		c.radius=7;
		c.area();
		c.display();
		
		Rectangle r=new Rectangle();
		r.len=7;
		r.wid=10;
		r.area();
		r.display();
	}

}
