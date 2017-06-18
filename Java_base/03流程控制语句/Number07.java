

import java.util.Scanner;

public class Number07 {
	/*
	 * 7．输入三角形的三条边，判断是否是一个三角形， 三角形的形状：等腰三角形，等边三角形，直角三角形，普通三角形，
	 * 求出周长，如果是直角三角形，另外求出面积
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();

		// 先将三边按从小打到的顺序排好。
		double temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		// 判断是否为三角形
		if (a + b <= c) {
			System.out.println("这不是一个三角形");
			return;
		}

		if (a == b || b == c || a == c) {
			if (a == b && b == c) {
				System.out.println("这是等边三角形");
				System.out.println("三角形的周长是" + (a + b + c));
				return;
			} else if (a * a + b * b - c * c == 0) {
				System.out.println("这是等腰直角三角形");
				System.out.println("三角形的周长是" + (a + b + c));
				System.out.println("等腰直角三角形的面积是" + (0.5 * a * b));
				return;
			} else {
				System.out.println("这是等腰三角形");
				System.out.println("三角形的周长是" + (a + b + c));
			}
			
		}else if ((a * a + b * b - c * c == 0)&&!(a == b || b == c || a == c) ) {
				System.out.println("这是直角三角形");
				System.out.println("三角形的周长是" + (a + b + c));
				System.out.println("直角三角形的面积是" + (0.5 * a * b));
				return;
			}else {
				System.out.println("这是普通三角形");
				System.out.println("三角形的周长是" + (a + b + c));
			}
		}
		

	}


