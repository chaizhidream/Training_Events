import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class optional1 {

	  public static void main(String[] args) {  
			int a[]=new int[20];
			   Random random = new Random();
			   int max=10;
			   int min=1;
			for (int i=0;i<a.length;i++) {
				a[i]=random.nextInt(max)%(max-min+1) + min;
				//int a=random.nextInt(max)%(max-min+1) + min;
				//求范围是max与min之间的随机数;
			}
			System.out.println(Arrays.toString(a));
			LinkedList<Integer> li=new LinkedList<Integer>();
			for (int i=0;i<a.length;i++) {
				if (a[i]%2!=0) {
					li.push(a[i]);
				}
				if (a[i]%2==0&&li.size()!=0) {
					li.pop();
				}
				if (li.size()==0) {
					continue;
				}
			}
			System.out.println(li);
			
			
	    }  
}
