import java.util.Arrays;
import java.util.Scanner;

/*
6����һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�
 */
public class Num6 {

	public static void main(String[] args) {
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(n);
		System.out.println("֮ǰ������Ϊ��" + Arrays.toString(n));
		System.out.print("����һ������");
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int a = sc.nextInt();
			fun(n, a);
			System.out.print("����һ������");
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
          System.out.println("����������Ϊ��" + Arrays.toString(n1));
		return n1;

	}

}
