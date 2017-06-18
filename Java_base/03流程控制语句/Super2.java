

import java.util.Scanner;

/*
 2．输入年月日，判断这是这一年中的第几天
 华为机试题原题
 */
public class Super2 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in) ;
	        System.out.print("请输入年：");
	        while(sc.hasNext()){
	            int year = sc.nextInt() ;
	            System.out.print("请输入月：");
	            int month = sc.nextInt() ;
	            System.out.print("请输入日：");
	            int day = sc.nextInt() ;
	            int Day = outDay(year, month, day) ;
	            System.out.println("这是"+year+"年中的第"+Day+"天");
	        }
	        sc.close();
	 
	    }
	 
	    private static int outDay(int year, int month, int day) {
	        int [] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
	        if(year <= 0 ||month <= 0 || month > 12 || day<= 0 || day > Day[month - 1])
	        {
	        	System.out.println("数据有误，请重新输入");
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

