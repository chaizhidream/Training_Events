

import java.util.Scanner;

/*
 4����һ���������ֽ������������磺���� 90,��ӡ�� 90=2*3*3*5��
 */
public class Super4 {

	  public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������һ������ ");
			while (sc.hasNext()) {
				primerNumber(sc.nextInt());
			}			
			sc.close();
		  }

	private static void primerNumber(int n) {
		System.out.print(n+"=");
		for(int i=2;i<=n;i++){
		 // ʹ��for(;n!=i;)ͬЧ
			while(n!=i)
		  {
		   if(n%i==0)
		   { 
		    System.out.print(i+"*");
		    n=n/i;
		   }
		   else break;
		  }
		 }
		
		System.out.println(n);//������һλ����
	}
	
	
}

