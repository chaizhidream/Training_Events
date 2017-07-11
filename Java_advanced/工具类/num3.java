import java.util.Arrays;
import java.util.Random;

/*3、生成十个 0~100 之间的随机数，放到数组中，然后排序输出。*/
public class num3 {

	public static void main(String[] args) {
		int a[]=new int[10];
		   Random random = new Random();
		   int max=100;
		   int min=0;
		for (int i=0;i<a.length;i++) {
			a[i]=random.nextInt(max)%(max-min+1) + min;
			//int a=random.nextInt(max)%(max-min+1) + min;
			//求范围是max与min之间的随机数;
		}
		Arrays.sort(a); 
		System.out.println(Arrays.toString(a));
	}

}
