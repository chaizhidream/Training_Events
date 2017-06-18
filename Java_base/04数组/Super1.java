import java.util.Arrays;

/*
 1．利用随机数生成一个整数数组，数组共有 10 个元素，每个元素的值都在 0-9 之间，打印
该数组并求平均数，多运行几次，看每次运行的结果是否相同。
 */
public class Super1 {

	public static void main(String[] args) {
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(n));
int avg=0;
for (int i : n) {
	avg+=i;
}
System.out.println("平均数为："+avg/10);
	}

}
