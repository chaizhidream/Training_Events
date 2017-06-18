import java.util.Arrays;

/*
7．输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Num7 {

	public static void main(String[] args) {
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
		System.out.println("输入的原始数组为：" + Arrays.toString(n));
		int max = 0, min = 0;
		for (int i = 0; i < n.length; i++)
		{
		if (n[i] > n[max]) max = i;
		if (n[i] < n[min]) min = i;
		}
		int temp = n[0];
		n[0] = n[max];
		n[max] = temp;
		temp = n[n.length - 1];
		n[n.length - 1] = n[min];
		n[min] = temp;
		
		System.out.println("改变后的数组为：" + Arrays.toString(n));
		
	}

}
