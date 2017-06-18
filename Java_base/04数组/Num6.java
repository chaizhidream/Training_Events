import java.util.Arrays;
import java.util.Scanner;

/*
6、有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 */
public class Num6 {

	public static void main(String[] args) {
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(n);
		System.out.println("之前的数组为：" + Arrays.toString(n));
		System.out.print("输入一个数：");
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int a = sc.nextInt();
			fun(n, a);
			System.out.print("输入一个数：");
		}
		sc.close();
	}

	private static int[] fun(int[] n, int a) {
         int[] n1=new int[n.length+1];
         int temp=0;
         for (int i= 0; n[i] <=a; i++) {
			n1[i]=n[i];
			temp=i;
		}
          n1[temp+1]=a; 
          
          for (int i = temp+2; i < n1.length; i++) {
        	 n1[i]=n[i-1];
		}
          System.out.println("加入后的数组为：" + Arrays.toString(n1));
		return n1;

	}

}
