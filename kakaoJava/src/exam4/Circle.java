package exam4;

public class Circle extends Shape implements Movable {
	private int radius ;
	public Circle() {}
	public Circle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius = radius;
	}
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	public int getRadius() {
		return radius;
	}
	
	@Override
	public double Circumference() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
