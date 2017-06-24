
public class CircleStatic {
	
	static double pi = 3.14;
	int radius = 100;
	
      public static void main(String[] args) {
    	 System.out.println(pi);
		//System.out.println(radius);
       //静态方法里不能直接用非静态属性,可以修改为：
		System.out.println(new CircleStatic().radius);
		Circle c = new Circle();
		System.out.println(c.radius);
	}
}

class Circle {
	static double pi = 3.14;
	int radius;

	public Circle() {
	}

	public Circle(int r) {
		radius = r;
	}

	public static double getPi() {
		return pi;
	}
	//修饰符顺序不对
//public void static showArea() {
	public  static void showArea() {
		// 静态方法里不能直接用非静态属性,添加一个实例
		Circle c = new Circle();
    System.out.println(pi*c.radius*c.radius);
}
}