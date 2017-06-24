package number3;

/*��3.����һ�������� Rectangle��
1)��������������getArea()�������getPer()���ܳ���showAll()�ֱ��ڿ���̨���������
������ܳ���
2)�� 2 �����ԣ��� length���� width
3)ͨ�����췽�� Rectangle(int width, int length)���ֱ���������Ը�ֵ
*/
public class Rectangle {

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea() {
		return this.width * this.length;
	}

	public int getPer() {
		return (this.width + this.length) * 2;
	}

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle() {

	}

	public void showAll() {
		System.out.println("����" + this.length);
		System.out.println("����" + this.width);
		System.out.println("�����" + getArea());
		System.out.println("�ܳ���" + getPer());
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(20, 30);
		r.showAll();

	}

}
