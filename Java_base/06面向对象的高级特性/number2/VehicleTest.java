package number2;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle car = new Vehicle("benz", "black");
		System.out.println("������Ʒ����" + car.getBrand());
		System.out.println("��������ɫ��" + car.getColor());
		car.run();
	}

}
