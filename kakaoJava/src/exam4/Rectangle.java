package exam4;

public class Rectangle extends Shape implements Movable{
	private int width;
	public Rectangle() {}
	public Rectangle(int width, int x, int y) {
		super(new Point(x,y));
		this.width=width;
	}
	
	
	
	
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double Circumference() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
