package number2;

/* 
2．（1）定义一个人类 Person：（知识点：对象的创建和使用）
      1)定义一个方法 sayHello()，可以向对方发出问候语“hello,my name is XXX”
      2)有三个属性：名字,年龄,身高
      3)通过构造方法，分别给三个属性赋值
       （2）定义一个 Constructor 类：
      1）创建两个对象，分别是 zhangsan，33 岁，1.73；lishi，44，1.74
      2）分别调用对象的 sayHello()方法。
*/
public class Constructor {

	public static void main(String[] args) {
		Person p1 = new Person("zhangsan", 33, 1.73);
		p1.sayHello();
		Person p2 = new Person("lishi", 44, 1.74);
		p2.sayHello();
	}

}
