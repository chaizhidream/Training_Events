
/*
15��һ��� 100 �׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
�����£������ڵ� 5�����ʱ�������������ף��ٷ�����������ף�
 */
public class Super15 {

	public static void main(String[] args) {
		double h=100,sum=0;
		for (int i = 0; i < 5; i++) {
			sum+=h;
			h/=2;
		}
		System.out.println("������"+sum+"��");
		System.out.println("�ٷ�������"+h+"��");
	}
}

