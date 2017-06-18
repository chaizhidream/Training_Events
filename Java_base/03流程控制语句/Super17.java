
/*
17．一个整数，它加上 100 后是一个完全平方数，再加上 168 又是一个完全平方数，
请问该数是多少？
 */
public class Super17 {

	public static void main(String[] args) {
		/*
		 * 首先考虑正整数，负整数类似。 a+100=x*x x*x+168=y*y 则
		 * (y+x)(y-x)=168,先计算出符合条件的两个因数（m,n）之积等于168，再另 y-x=m;y+x=n则x=(n-m)/2;
		 * 最终： a=x*x-100。显然，x一定大于10。
		 */
		int x;
		// 先计算168的所有x*y形式。两个数的积一定，则一定有一个因子m小于等于Math.sqrt(N)
		for (int i = 1; i <= Math.sqrt(168); i++) {
			if (168 % i == 0) {
				x = (168 / i - i) / 2;

				if (x >= 10) {
					System.out.println(x * x - 100);
				}

			}
		}

	}

}
