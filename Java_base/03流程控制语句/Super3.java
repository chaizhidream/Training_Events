

import java.util.Scanner;

/*
 2��3�� ������������һ�� 4 λ�������󽫸�����ת�Ժ��������ԭ��Ϊ 1234����ת�����λ4321
 ��Ϊ������ԭ�⣺
 ���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
 */
public class Super3 {

	  public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				System.out.println(new StringBuffer(Integer.toString(sc.nextInt())).reverse().toString());
			}
			//���Ϊ�ַ�����ʽ����Ҫ���������������һ�� ���ַ�����Ϊ����
			// int a = Integer.parseInt(s);
			sc.close();
		  }	
	}

