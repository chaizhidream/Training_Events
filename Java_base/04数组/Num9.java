import java.util.Arrays;

/*
9. ��һ�������е��ظ�Ԫ�ر���һ�����������㡣
 */

public class Num9 {

	public static void main(String[] args) {
		int[] a={1,2,3,5,4,1,4,9,4,10,52,4,9,1,4,3,7,6,5,45};
		System.out.println("�����ԭʼ����Ϊ��" + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a.length; j++) {
	                if (a[i]==a[j]&&i!=j) //����ע��ǧ��Ҫ��Ԫ�رȽ���������������
	                {
	                    a[j]=-1;
	                }
	            }
	        }
	        for (int n : a) {
	        	if (n!=-1) {
					System.out.print(n+" ");
				}
	            
	        }
		
	}
}
