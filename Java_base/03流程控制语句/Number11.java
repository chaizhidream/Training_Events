

   /*
    11�� �ֱ�ʹ�� for ѭ����while ѭ����do ѭ���� 1 �� 100 ֮�������ܱ� 3 �����������ĺ͡�
   */

public class Number11 {
	
	
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <=100; i++) {
			if (i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}
	
	
	//����whileѭ��ʵ��
	/*
	public static void main(String[] args) {
		int sum=0;
		int i=100;
		while(i--!=0) {
			if (i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	*/
	
	
	//����doѭ��ʵ��
	/*	
		public static void main(String[] args) {
			int sum=0;
			int i=0;
			do {
				i++;
				if (i%3==0) {
					sum+=i;
				}
			} while (i!=100);
			System.out.println("ֵΪ"+sum);
		}
		*/
	
	
	
	
}
