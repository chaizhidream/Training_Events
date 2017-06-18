

import java.util.Scanner;

/*
 1．从控制台输入 2 个数字，求两者之间最大值，
        再从控制台输入 3 个数字，求三个数字的
        最大值，用三目运算符求。
 */
public class Super1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int max1=n1>n2?n1:n2;
		System.out.println(n1+"与"+n2+"两者间最大值为"+max1);
		System.out.println("请再输入三个数");
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		int max2=n3>n4?n3:n4;
		int max3=max2>n5?max2:n5;
		System.out.println(n3+"、"+n4+"、"+n5+"三者间最大值为"+max3);
		sc.close();
	}

}
