package number1;
/*1．（1）定义一个人类 Person：（知识点：对象的创建和使用）
1)定义一个方法 sayHello()，可以向对方发出问候语“hello,my name is XXX”
2)有三个属性：名字、身高、体重
（2）定义一个 PersonCreate 类：
1）创建两个对象，分别是 zhangsan，33 岁，1.73；lishi，44，1.74
2）分别调用对象的 sayHello()方法。
*/
public class PersonCreate {

		 public static void main(String[] args){
			
			Person p1= new Person();
			p1.setName("zhangsan");
			p1.setAge(33);
			p1.setHeight(1.73);
		    p1.sayHello();
		    
		    Person p2= new Person();
			p2.setName("lishi");
			p2.setHeight(44);
			p2.setHeight(1.74);
		    p2.sayHello();
		}

	}


