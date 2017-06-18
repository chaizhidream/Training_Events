



/*
 5．打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 例如：153 是一个"水仙花数"，因为 153=1 的三次方＋5 的三次方＋3 的三次方。
 */
public class Super5 {

	  public static void main(String[] args) {
			for(int i=100;i<=999;i++)
				if(flower(i)){
					System.out.println(i);
				}
	}

	private static boolean flower(int i) {
		boolean flag=false;
		int a=i/100;
		int b=(i-a*100)/10;
		int c=i%10;
		if(a*a*a+b*b*b+c*c*c-i==0){
			flag=true;
		}
		return flag;
	}
	
	
}

