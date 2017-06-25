package number2;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle car = new Vehicle("benz", "black");
		System.out.println("汽车的品牌是" + car.getBrand());
		System.out.println("汽车的颜色是" + car.getColor());
		car.run();
	}

}
