import java.util.Arrays;

/*
8�� ��һ�������е�Ԫ��������
 */
public class Num8 {

	public static void main(String[] args) {
		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 100);
		}
		System.out.println("�����ԭʼ����Ϊ��" + Arrays.toString(n));
		for (int i = 0; i < n.length/2; i++) {
			int temp=n[i];
			n[i]=n[n.length-1];
			n[n.length-1]=temp;
		}
		System.out.println("�ı�������Ϊ��" + Arrays.toString(n));
		
	}

	

}
