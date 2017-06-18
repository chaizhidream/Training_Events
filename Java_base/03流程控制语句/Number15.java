



public class Number15 {
	/*
        15． 编写一个程序，找出大于 200 的最小的质数
   */
	public static void main(String[] args) {
		for(int i=201;;i++){
			if (!number(i)) {
				System.out.println("大于 200 的最小的质数为"+i);
				break;
			}else {
				continue;
			}
		}

	}
//判断一个数是不是质数，是质数返回FALSE，是合数返回TRUE
	private static boolean number(int i) {
boolean flag = false;
		
		if (i>1) 
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = true;
				}
			}
		}
			
			
		return flag;
	
}
	
}
