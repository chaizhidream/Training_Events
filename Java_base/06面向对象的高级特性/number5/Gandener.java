package number5;

import java.util.Scanner;

public class Gandener {

	public static Fruit creat(String name) {
		Fruit f = null;
		if (name.equals("ƻ��")) {
			f = new Apple();
		} else if (name.equals("����")) {
			f = new Pear();
		} else if (name.equals("����")) {
			f = new Oranges();
		} else {
			System.out.println("������");
		}

		return f;
	}

	public static void main(String[] args) {
		System.out.println("������һ������");
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String name = input.next();
			creat(name);
			System.out.println("������һ������");
		}

		input.close();

	}

}
