import java.util.Arrays;

/*
 1���������������һ���������飬���鹲�� 10 ��Ԫ�أ�ÿ��Ԫ�ص�ֵ���� 0-9 ֮�䣬��ӡ
�����鲢��ƽ�����������м��Σ���ÿ�����еĽ���Ƿ���ͬ��
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
System.out.println("ƽ����Ϊ��"+avg/10);
	}

}
