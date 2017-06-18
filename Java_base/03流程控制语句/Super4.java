

import java.util.Scanner;

/*
 4．将一个正整数分解质因数。例如：输入 90,打印出 90=2*3*3*5。
 */
public class Super4 {

	  public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入一个数： ");
			while (sc.hasNext()) {
				primerNumber(sc.nextInt());
			}			
			sc.close();
		  }

	private static void primerNumber(int n) {
		System.out.print(n+"=");
		for(int i=2;i<=n;i++){
		 // 使用for(;n!=i;)同效
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
		
		System.out.println(n);//输出最后一位质数
	}
	
	
}

