package number5;

import number4.Point;

/*5�� ��дһ�����򣬴������� Point ���� p1��p2���ֱ���� movePoint �����󣬴�ӡ p1 ��
p2 �����ꡣ
*/
public class NewPoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.movePoint(10, 20);
		Point p2 = new Point();
		p2.movePoint(20, 30);
		System.out.println("����p1���λ��Ϊ("+p1.getX()+","+p1.getY()+")");
		System.out.println("����p2���λ��Ϊ("+p2.getX()+","+p2.getY()+")");
	}

}
