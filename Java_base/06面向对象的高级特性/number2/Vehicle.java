package number2;

/*2��(1)����һ�������� Vehicle��Ҫ�����£�
��a�����԰���������Ʒ�� brand��String ���ͣ�����ɫ color��String ���ͣ�����
�� speed��double ���ͣ���
��b�������ṩһ���вεĹ��췽����Ҫ��Ʒ�ƺ���ɫ���Գ�ʼ��Ϊ����ֵ����
�ٶȵĳ�ʼֵ����Ϊ 0����
��c��Ϊ�����ṩ������������ע�⣺����Ʒ��һ����ʼ��֮�����޸ġ�
��d������һ��һ�㷽�� run()���ô�ӡ��������������ܵĹ���
��������� VehicleTest������ main �����д���һ��Ʒ��Ϊ��benz������ɫΪ��black��
��������
(2)����һ�� Vehicle �������γ��� Car��Ҫ�����£�
��a���γ����Լ������������� loader��int ���ͣ���
��b���ṩ�����ʼ�����ԵĹ��췽����
(c)���¶��� run()���ô�ӡ��������γ����ܵĹ��ܡ�
��d����������� Test������ main �����д���һ��Ʒ��Ϊ��Honda������ɫΪ��red����
������Ϊ 2 �˵Ľγ�
*/
public class Vehicle {

	private String brand;
	private String color;
	private double speed;

	public String getBrand() {
		return brand;
	}

	// ע�⣺����Ʒ��һ����ʼ��֮�����޸�
	// public void setBrand(String brand) {
	// this.brand = brand;
	// }
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
		this.speed = 0.0;
	}

	public Vehicle(String brand, String color) {
		this.brand = brand;
		this.color = color;
		this.speed = 0.0;
	}

	public Vehicle(String brand, String color, double speed) {
		this.brand = brand;
		this.color = color;
		this.speed = 0.0;
	}

	public void run() {
		System.out.println("�������ٶȺܿ�");
	}

}
