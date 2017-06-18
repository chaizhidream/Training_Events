
/*
11、给定一维数组{ -10，2，3，246，-100，0，5} ，计算出数组中的平均值、最大值、最
小值。
 */

public class Num11 {

	public static void main(String[] args) {
	int[] n={-10,2,3,246,-100,0,5};
	double sum=0.00;
	int max=0,min=0;
	for (int i = 0; i < n.length; i++) {
		sum+=n[i];
		if (max<n[i]) {
			max=n[i];
		}if (min>n[i]) {
			min=n[i];		
			}
	}
		System.out.println("平均值为："+sum/n.length);
		System.out.println("最大值为："+max);
		System.out.println("最小值为："+min);
	
	}
}
