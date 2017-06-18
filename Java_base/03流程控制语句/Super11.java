
/*
11．打印以下图形
 */
public class Super11 {

	public static void main(String[] args) {
		int j = 1, k = 1;// 控制换行
		for (int i = 1; i <= 15; i++) {
			System.out.printf("%4d",i);
			System.out.print("  ");
			j++;
		
		if (j > k) {
			j = 1;
			k++;
			System.out.println("");
		}}
	}
}