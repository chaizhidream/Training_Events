
/*
11������һά����{ -10��2��3��246��-100��0��5} ������������е�ƽ��ֵ�����ֵ����
Сֵ��
 */

public class Num11 {

	public static void main(String[] args) {
	int[] n={-10,2,3,246,-100,0,5};
	double sum=0.00;
	int max=0,min=0;
	for (int i = 0; i < n.length; i++) {
		sum+=n[i];
		if (max<n[i]) {
			max=n[i];
		}if (min>n[i]) {
			min=n[i];		
			}
	}
		System.out.println("ƽ��ֵΪ��"+sum/n.length);
		System.out.println("���ֵΪ��"+max);
		System.out.println("��СֵΪ��"+min);
	
	}
}
