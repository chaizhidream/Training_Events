import java.util.Arrays;

/*
7���������飬�������һ��Ԫ�ؽ�������С�������һ��Ԫ�ؽ�����������顣
 */
public class Num7 {

	public static void main(String[] args) {
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
		System.out.println("�����ԭʼ����Ϊ��" + Arrays.toString(n));
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
		
		System.out.println("�ı�������Ϊ��" + Arrays.toString(n));
		
	}

}
