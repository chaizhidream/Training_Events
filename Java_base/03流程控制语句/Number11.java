

   /*
    11． 分别使用 for 循环，while 循环，do 循环求 1 到 100 之间所有能被 3 整除的整数的和。
   */

public class Number11 {
	
	
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <=100; i++) {
			if (i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}
	
	
	//采用while循环实现
	/*
	public static void main(String[] args) {
		int sum=0;
		int i=100;
		while(i--!=0) {
			if (i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	*/
	
	
	//采用do循环实现
	/*	
		public static void main(String[] args) {
			int sum=0;
			int i=0;
			do {
				i++;
				if (i%3==0) {
					sum+=i;
				}
			} while (i!=100);
			System.out.println("值为"+sum);
		}
		*/
	
	
	
	
}
