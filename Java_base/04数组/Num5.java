/*
5． 在一个有 8 个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。
 */
public class Num5 {

	public static void main(String[] args) {
	int[] n={18,25,7,36,13,2,89,63};
	int max=0,temp=0;
	for (int i = 0; i < n.length; i++) {
		if (max<=n[i]) {
			max=n[i];
			temp=i;
		}
	}
	
	System.out.println(max);
	System.out.println(temp);
	}

}
