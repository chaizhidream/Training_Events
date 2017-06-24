package number1;
/*1．（1）定义一个人类 Person：（知识点：对象的创建和使用）
1)定义一个方法 sayHello()，可以向对方发出问候语“hello,my name is XXX”
2)有三个属性：名字、身高、体重
（2）定义一个 PersonCreate 类：
1）创建两个对象，分别是 zhangsan，33 岁，1.73；lishi，44，1.74
2）分别调用对象的 sayHello()方法。
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
