package number9;
/*9������һ�������� Vehicle��Ҫ�����£���֪ʶ�㣺����Ĵ�����ʹ�ã�
��1�����԰���������Ʒ�� brand��String ���ͣ�����ɫ color��String ���ͣ����ٶ� speed��double
���ͣ���������������Ϊ˽�С�
��2�������ṩһ���вεĹ��췽����Ҫ��Ʒ�ƺ���ɫ���Գ�ʼ��Ϊ����ֵ�����ٶȵĳ�ʼ
ֵ����Ϊ 0����
��3��Ϊ˽�������ṩ������������ע�⣺����Ʒ��һ����ʼ��֮�����޸ġ�
��4������һ��һ�㷽�� run()���ô�ӡ��������������ܵĹ���
��������� VehicleTest������ main �����д���һ��Ʒ��Ϊ��benz������ɫΪ��black����������
*/
public class Vehicle {
	
private String brand;
private String color;
private double speed;

public String getBrand() {
	return brand;
}
//ע�⣺����Ʒ��һ����ʼ��֮�����޸�
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
	System.out.println("�������ٶ�Ϊ"+this.speed);
}

}
