package number2;

public class Test {

	public static void main(String[] args) {
		Car c = new Car("Honda", "red", 2);
		c.run();
		System.out.println("������Ʒ����" + c.getBrand());
		System.out.println("��������ɫ��" + c.getColor());
		System.out.println("��������������" + c.getLoader());
	}

}
