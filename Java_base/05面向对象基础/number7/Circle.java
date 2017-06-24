package number7;
/*7．定义一个圆类 Circle，描述圆对象。圆有一个属性 radius 表示半径，还有一个 findArea
方法用于计算圆的面积。定义一个测试类。给半径赋值为 5，并且输出圆的面积。
*/
public class Circle {
	
private double radius;

public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}

public double  findArea() {
	return Math.PI*radius*radius;
	
}
	

}
