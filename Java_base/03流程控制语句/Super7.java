

import java.util.Scanner;

/*
7���� s=a+aa+aaa+aaaa+aa...a ��ֵ������ a ��һ�����֡�
���� 2+22+222+2222+22222(��ʱ���� 5 �������)��
����������ɼ��̿��ơ���֪ʶ�㣺ѭ����䡢������䣩
 */
public class Super7 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������a��ֵ");
		int a=sc.nextInt();
		System.out.println("��������Ӵ���");
		int n=sc.nextInt();
		sc.close();
		
		int sum=0;
		int current=a,next;
		while(n>0){
			sum=sum+current;
			next=current*10+a;
			current=next;
			n--;
		}
		System.out.println(sum);	
		}
	}
	
	


