

import java.util.Scanner;

/*
 1���ӿ���̨���� 2 �����֣�������֮�����ֵ��
        �ٴӿ���̨���� 3 �����֣����������ֵ�
        ���ֵ������Ŀ�������
 */
public class Super1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int max1=n1>n2?n1:n2;
		System.out.println(n1+"��"+n2+"���߼����ֵΪ"+max1);
		System.out.println("��������������");
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		int max2=n3>n4?n3:n4;
		int max3=max2>n5?max2:n5;
		System.out.println(n3+"��"+n4+"��"+n5+"���߼����ֵΪ"+max3);
		sc.close();
	}

}
