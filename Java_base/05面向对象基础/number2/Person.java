package number2;
/* 
 2����1������һ������ Person����֪ʶ�㣺����Ĵ�����ʹ�ã�
       1)����һ������ sayHello()��������Է������ʺ��hello,my name is XXX��
       2)���������ԣ�����,����,���
       3)ͨ�����췽�����ֱ���������Ը�ֵ
        ��2������һ�� Constructor �ࣺ
       1�������������󣬷ֱ��� zhangsan��33 �꣬1.73��lishi��44��1.74
       2���ֱ���ö���� sayHello()������
 */
public class Person {

	private String name;
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	

	public Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void sayHello() {
		System.out.println("hello,my name is " + this.name);
	}

}
