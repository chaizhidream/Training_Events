

import java.util.Scanner;

public class Number04 {
/*
 * 4．输入一个年份，判断这个年份是否是闰年
 */
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     while (sc.hasNext()) {
		     //这里是主要的代码块
	    	 int x=sc.nextInt();
	    	 if (((x%4==0)&&(x%100!=0))||(x%400==0)) {
				System.out.println(x+"年是闰年");
			}else {
				System.out.println(x+"年不是闰年");
			}
	     }
	     sc.close();
    }

}
