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
		System.out.println("�뾶��"+radius);
		System.out.println("��ɫ��"+color);
		System.out.println("�����"+getArea());
		System.out.println("�ܳ���"+getPer());
	}

}
