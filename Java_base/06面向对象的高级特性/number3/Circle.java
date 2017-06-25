package number3;

public class Circle extends Sharp {
private double radius;
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public Circle() {
	
}
public Circle(double radius, String color) {
	this.radius = radius;
	this.color = color ;
}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double getPer() {
		return 2*Math.PI*radius;
	}

	@Override
	public void showAll() {
		System.out.println("半径是"+radius);
		System.out.println("颜色是"+color);
		System.out.println("面积是"+getArea());
		System.out.println("周长是"+getPer());
	}

}
