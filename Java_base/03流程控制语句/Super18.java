
/*
18．古典问题：有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔子长到第三个
月后每个月又生一对兔子，假如兔子都不死，问 12 个月内每个月的兔子总数为多少？兔子
的规律为数列 1,1,2,3,5,8,13,21.... 
 */
public class Super18 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 12; i++) {
			sum+=f(i);
			System.out.println("第"+i+"个月的兔子总数为："+sum);
		}
	}

	private static int f(int i) {
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return f(i - 1) + f(i - 2);
		}

	}
}
