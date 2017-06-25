package number5;

import java.util.Scanner;

public class Gandener {

	public static Fruit creat(String name) {
		Fruit f = null;
		if (name.equals("苹果")) {
			f = new Apple();
		} else if (name.equals("梨子")) {
			f = new Pear();
		} else if (name.equals("橘子")) {
			f = new Oranges();
		} else {
			System.out.println("不会种");
		}

		return f;
	}

	public static void main(String[] args) {
		System.out.println("请输入一个对象");
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String name = input.next();
			creat(name);
			System.out.println("请输入一个对象");
		}

		input.close();

	}

}
