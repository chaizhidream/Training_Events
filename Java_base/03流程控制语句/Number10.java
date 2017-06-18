

import java.util.Scanner;

public class Number10 {
	/*
        10．企业发放的奖金根据利润提成。利润低于或等于 10 万元时，奖金可提 10%；利润高于
     10 万元，低于 20 万元时，低于 10 万元的部分按 10%提成，高于 10 万元的部分，可提成 7.5%；
     20 万到 40 万之间时，高于 20 万元的部分，可提成 5%；40 万到 60 万之间时高于 40 万元的
             部分，可提成 3%；60 万到 100 万之间时，高于 60 万元的部分，可提成 1.5%，高于 100 万
           元时，超过 100 万元的部分按 1%提成，从键盘输入当月利润，求应发放奖金总数
   */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println("应发奖金为"+sum(sc.nextInt())+"万元");	
		}
		sc.close();
	}
//被调用的求奖金函数，单位是(:万元)
	private static double sum(int n) {
		double money = 0.0;
		if (n<=10) {
			money=0.1*n;
		}
		if (n>10&&n<=20) {
			money=(n-10)*0.075+10*0.1;	
		}if (n>20&&n<=40) {
			money=(n-20)*0.05+10*0.075+1;	
		}if (n>40&&n<=60) {
			money=(n-40)*0.03+20*0.05+10*0.075+1;	
		}if (n>60&&n<=100) {
			money=(n-60)*0.015+20*0.03+20*0.05+10*0.075+1;	
		}if (n>100) {
			money=(n-100)*0.01+40*0.015+20*0.03+20*0.05+10*0.075+1;	
		}
		return money;
	}
}
