package number3;

/*3、设计四个类，分别是：
 （1）Shape 表示图形类，有面积属性 area、周长属性 per，颜色属性 color，
有两个构造方法（一个是默认的、一个是为颜色赋值的），还有 3 个抽象方法，
分别是：getArea 计算面积、getPer 计算周长、showAll 输出所有信息，还有
一个求颜色的方法 getColor。
（2）2 个子类：
1）Rectangle 表示矩形类，增加两个属性，Width 表示长度、height 表示宽
度，重写 getPer、getArea 和 showAll 三个方法，另外又增加一个构造方法（一
个是默认的、一个是为高度、宽度、颜色赋值的）。
2）Circle 表示圆类，增加 1 个属性，radius 表示半径，重写 getPer、getArea
和 showAll 三个方法，另外又增加两个构造方法（为半径、颜色赋值的）。
（3）一个测试类 PolyDemo，在 main 方法中，声明创建每个子类的对象，并
调用 2 个子类的 showAll 方法。
 */
public abstract class Sharp {

	protected double area;

	protected double per;
	protected String color;

	public Sharp() {

	}

	public Sharp(String color) {
		this.color = color;
	}

	public abstract double getArea();

	public abstract double getPer();

	public abstract void showAll();

	public String getColor() {
		return color;
    }

}
