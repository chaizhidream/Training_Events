import java.util.Arrays;
import java.util.Random;

/*3������ʮ�� 0~100 ֮�����������ŵ������У�Ȼ�����������*/
public class num3 {

	public static void main(String[] args) {
		int a[]=new int[10];
		   Random random = new Random();
		   int max=100;
		   int min=0;
		for (int i=0;i<a.length;i++) {
			a[i]=random.nextInt(max)%(max-min+1) + min;
			//int a=random.nextInt(max)%(max-min+1) + min;
			//��Χ��max��min֮��������;
		}
		Arrays.sort(a); 
		System.out.println(Arrays.toString(a));
	}

}
