

import java.util.Scanner;

/*
 2�����������գ��ж�������һ���еĵڼ���
 ��Ϊ������ԭ��
 */
public class Super2 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in) ;
	        System.out.print("�������꣺");
	        while(sc.hasNext()){
	            int year = sc.nextInt() ;
	            System.out.print("�������£�");
	            int month = sc.nextInt() ;
	            System.out.print("�������գ�");
	            int day = sc.nextInt() ;
	            int Day = outDay(year, month, day) ;
	            System.out.println("����"+year+"���еĵ�"+Day+"��");
	        }
	        sc.close();
	 
	    }
	 
	    private static int outDay(int year, int month, int day) {
	        int [] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
	        if(year <= 0 ||month <= 0 || month > 12 || day<= 0 || day > Day[month - 1])
	        {
	        	System.out.println("������������������");
	            return -1;
	        }
	        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
	            Day[1] = 29 ;
	        }
	         
	        int sum = 0 ;
	        for(int i = 0 ; i < month - 1 ; i ++){
	            sum += Day[i] ;
	        }
	        return sum + day;
	    }
		
	}

