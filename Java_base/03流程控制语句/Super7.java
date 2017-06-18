

import java.util.Scanner;

/*
7．求 s=a+aa+aaa+aaaa+aa...a 的值，其中 a 是一个数字。
例如 2+22+222+2222+22222(此时共有 5 个数相加)，
几个数相加由键盘控制。（知识点：循环语句、条件语句）
 */
public class Super7 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入a的值");
		int a=sc.nextInt();
		System.out.println("请输入相加次数");
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
	
	


