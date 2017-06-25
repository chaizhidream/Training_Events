package number1;
/*
 1、如下两个类之间存在一定的联系，请用面向对象的特性实现类及其关系：
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

public Person(String name, int age, double height) {
	this.name = name;
	this.age = age;
	this.height = height;
}
public void sayHello() {
	System.out.println("hello,my name is " + this.name);
}

}
