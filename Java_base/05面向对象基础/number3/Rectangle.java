package number3;

/*．3.定义一个矩形类 Rectangle：
1)定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、
面积、周长。
2)有 2 个属性：长 length、宽 width
3)通过构造方法 Rectangle(int width, int length)，分别给两个属性赋值
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
		System.out.println("长是" + this.length);
		System.out.println("宽是" + this.width);
		System.out.println("面积是" + getArea());
		System.out.println("周长是" + getPer());
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(20, 30);
		r.showAll();

	}

}
