

import java.util.Scanner;

public class Number04 {
/*
 * 4������һ����ݣ��ж��������Ƿ�������
 */
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	     while (sc.hasNext()) {
		     //��������Ҫ�Ĵ����
	    	 int x=sc.nextInt();
	    	 if (((x%4==0)&&(x%100!=0))||(x%400==0)) {
				System.out.println(x+"��������");
			}else {
				System.out.println(x+"�겻������");
			}
	     }
	     sc.close();
    }

}
