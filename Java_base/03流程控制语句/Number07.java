

import java.util.Scanner;

public class Number07 {
	/*
	 * 7�����������ε������ߣ��ж��Ƿ���һ�������Σ� �����ε���״�����������Σ��ȱ������Σ�ֱ�������Σ���ͨ�����Σ�
	 * ����ܳ��������ֱ�������Σ�����������
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();

		// �Ƚ����߰���С�򵽵�˳���źá�
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
		// �ж��Ƿ�Ϊ������
		if (a + b <= c) {
			System.out.println("�ⲻ��һ��������");
			return;
		}

		if (a == b || b == c || a == c) {
			if (a == b && b == c) {
				System.out.println("���ǵȱ�������");
				System.out.println("�����ε��ܳ���" + (a + b + c));
				return;
			} else if (a * a + b * b - c * c == 0) {
				System.out.println("���ǵ���ֱ��������");
				System.out.println("�����ε��ܳ���" + (a + b + c));
				System.out.println("����ֱ�������ε������" + (0.5 * a * b));
				return;
			} else {
				System.out.println("���ǵ���������");
				System.out.println("�����ε��ܳ���" + (a + b + c));
			}
			
		}else if ((a * a + b * b - c * c == 0)&&!(a == b || b == c || a == c) ) {
				System.out.println("����ֱ��������");
				System.out.println("�����ε��ܳ���" + (a + b + c));
				System.out.println("ֱ�������ε������" + (0.5 * a * b));
				return;
			}else {
				System.out.println("������ͨ������");
				System.out.println("�����ε��ܳ���" + (a + b + c));
			}
		}
		

	}


