
public class CircleStatic {
	
	static double pi = 3.14;
	int radius = 100;
	
      public static void main(String[] args) {
    	 System.out.println(pi);
		//System.out.println(radius);
       //��̬�����ﲻ��ֱ���÷Ǿ�̬����,�����޸�Ϊ��
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
	//���η�˳�򲻶�
//public void static showArea() {
	public  static void showArea() {
		// ��̬�����ﲻ��ֱ���÷Ǿ�̬����,���һ��ʵ��
		Circle c = new Circle();
    System.out.println(pi*c.radius*c.radius);
}
}