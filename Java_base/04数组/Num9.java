import java.util.Arrays;

/*
9. 将一个数组中的重复元素保留一个其他的清零。
 */

public class Num9 {

	public static void main(String[] args) {
		int[] a={1,2,3,5,4,1,4,9,4,10,52,4,9,1,4,3,7,6,5,45};
		System.out.println("输入的原始数组为：" + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a.length; j++) {
	                if (a[i]==a[j]&&i!=j) //这里注意千万不要让元素比较自身，否则都是零了
	                {
	                    a[j]=-1;
	                }
	            }
	        }
	        for (int n : a) {
	        	if (n!=-1) {
					System.out.print(n+" ");
				}
	            
	        }
		
	}
}
