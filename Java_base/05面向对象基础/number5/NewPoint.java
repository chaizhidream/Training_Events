package number5;

import number4.Point;

/*5． 编写一个程序，创建两个 Point 对象 p1、p2，分别调研 movePoint 方法后，打印 p1 和
p2 的坐标。
*/
public class NewPoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.movePoint(10, 20);
		Point p2 = new Point();
		p2.movePoint(20, 30);
		System.out.println("现在p1点的位置为("+p1.getX()+","+p1.getY()+")");
		System.out.println("现在p2点的位置为("+p2.getX()+","+p2.getY()+")");
	}

}
