
/*
13�������������� a �� b����֪ a*b=2048���� a��b ��Ϊ��ֵʱ��a+b ��ֵ��Сֵ��
 */
public class Super13 {

	public static void main(String[] args) {
		int min=2049;
		for (int i = 1; i <= Math.sqrt(2048); i++) {
			if(2048%i==0){
				min =(min<(i+2048/i))? min:(i+2048/i);
			}
		}
		System.out.println("a+b����СֵΪ"+min);

	}
}