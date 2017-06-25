package number2;

public class Test {

	public static void main(String[] args) {
		Car c = new Car("Honda", "red", 2);
		c.run();
		System.out.println("车辆的品牌是" + c.getBrand());
		System.out.println("车辆的颜色是" + c.getColor());
		System.out.println("车辆荷载人数是" + c.getLoader());
	}

}
