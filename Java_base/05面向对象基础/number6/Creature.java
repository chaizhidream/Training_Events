package number6;
/*6． 
 （1）定义一个动物类 Creature（知识点：对象的创建和使用）
     1)定义一个方法 setSnarl(Cat cat)可以设置动物发出猫的声音
     2)setSnarl(Dog dog)可以设置动物发出狗的声音
     3)定义一个 outPut()方法，可以输出动物的声音
（2）要求定义一个猫类 Cat，具有猫的声音，将猫类传入动物类 Creature 的吼叫方法
setSnarl(Cat cat)可以设置动物发出猫的声音
（3）要求定义一个狗类 Dog，具有狗的声音，将狗类传入动物类 Creature 的吼叫方法
setSnarlDog dog)可以设置动物发出狗的声音
（4）定义一个 Sound 类，在 main 方法里调用 Creature 类的 setSnarl()和 outPut()方法分
别设置动物的声音和输出动物的声音
*/

public class Creature {

	
public String setSnarl(Cat cat) {
	return "这是猫的叫声：";
}

public String setSnarl(Dog dog) {
	return "这是狗的叫声：";
}



public String output() {
	return "";
}
  

}
