

import java.util.Scanner;

public class Number09 {
	/*
	 * 9�� ��дһ�����򣬼����ʾֻ��Ļ�ѡ�
	 * ��������С�� 100 Ԫ�����ΪһԪ��
	 * �������� 100 Ԫ�� 5000 Ԫ֮�䣬�� 1%��ȡ��ѣ�
	 * ��������� 5000 Ԫ�����Ϊ 50 Ԫ������������������롣
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n<100) {
				System.out.println("���Ϊ"+1+"Ԫ");
			}else if (n>=100&&n<5000) {
				System.out.println("���Ϊ"+n*0.01+"Ԫ");
			}else {
				System.out.println("���Ϊ"+50+"Ԫ");
			}
			
		}
		sc.close();
	}
}
