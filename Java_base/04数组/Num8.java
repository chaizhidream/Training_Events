import java.util.Arrays;

/*
8． 将一个数组中的元素逆序存放
 */
public class Num8 {

	public static void main(String[] args) {
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
		System.out.println("输入的原始数组为：" + Arrays.toString(n));
		for (int i = 0; i < n.length/2; i++) {
			int temp=n[i];
			n[i]=n[n.length-1];
			n[n.length-1]=temp;
		}
		System.out.println("改变后的数组为：" + Arrays.toString(n));
		
	}

	

}
