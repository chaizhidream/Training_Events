package number9;
/*9．定义一个汽车类 Vehicle，要求如下：（知识点：对象的创建和使用）
（1）属性包括：汽车品牌 brand（String 类型）、颜色 color（String 类型）和速度 speed（double
类型），并且所有属性为私有。
（2）至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始
值必须为 0）。
（3）为私有属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。
（4）定义一个一般方法 run()，用打印语句描述汽车奔跑的功能
定义测试类 VehicleTest，在其 main 方法中创建一个品牌为“benz”、颜色为“black”的汽车。
*/
public class Vehicle {
	
private String brand;
private String color;
private double speed;

public String getBrand() {
	return brand;
}
//注意：汽车品牌一旦初始化之后不能修改
//public void setBrand(String brand) {
//	this.brand = brand;
//}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}

public Vehicle() {
	this.speed=0.0;
}
public Vehicle(String brand, String color) {
	this.brand = brand;
	this.color = color;
	this.speed=0.0;
}
public Vehicle(String brand, String color,double speed) {
	this.brand = brand;
	this.color = color;
	this.speed=0.0;
}
public void run(){
	System.out.println("汽车的速度为"+this.speed);
}

}
