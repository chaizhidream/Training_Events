package number1;
/*1����1������һ������ Person����֪ʶ�㣺����Ĵ�����ʹ�ã�
1)����һ������ sayHello()��������Է������ʺ��hello,my name is XXX��
2)���������ԣ����֡���ߡ�����
��2������һ�� PersonCreate �ࣺ
1�������������󣬷ֱ��� zhangsan��33 �꣬1.73��lishi��44��1.74
2���ֱ���ö���� sayHello()������
*/

public class Person {

	private String name;
	private double height;
	private double weight;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	public void sayHello() {
		System.out.println("hello,my name is " + this.name);
	}

}
