

/*
 6．判断 101-200 之间有多少个素数，并输出所有素数。
 所谓素数 n 是指，除 1 和 n 之外，不能被 2～（n-1）之间的任何整数整除。
 */
public class Super6 {
	
	public static void main(String[] args) {
		int count=0;
		for(int i=101;i<200;i++)
			if(!number(i)){
				System.out.println(i);
				count++;
			}
		System.out.println("有"+count+"个素数");
}
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
	
	


