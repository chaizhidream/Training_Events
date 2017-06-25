package number3;

public class PolyDemo {

	public static void main(String[] args) {
		Rectangle re=new Rectangle(3.0,2.0,"红色");
		System.out.println("长方形的信息为：");
		re.showAll();
		System.out.println();
		System.out.println("圆形的信息为：");
		Circle ci=new Circle(3.0,"绿色");
		ci.showAll();
	}

}
