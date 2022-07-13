package exam4;

public abstract class Shape {
	protected Point point;
	public Shape() {
		
	}
	public Shape(Point point) {
		this.point=point;
	}
	public abstract double getArea();
	public abstract double Circumference();
	
	
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
	
}
