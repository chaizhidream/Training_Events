import java.util.Scanner;

/*3�� ��һ�����л������������ͷ�����һ������ 12321 ����һ������������дһ�����򣬴�
�����еõ�һ���������жϸ����ǲ��ǻ�������*/
public class optional3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
		isPalindrome(sc.nextInt());
		}
		sc.close();
	}

	//�˷����ܵ�����ֵ���ޣ�������Χ��������ַ����������룬���ж��ַ����Ƿ�Ϊ���֡�
	private static void isPalindrome(int n) {
		String s=String.valueOf(n);
		for (int i = 0; i <=s.length()/2 ; i++) {
			if(!(s.charAt(i)==s.charAt(s.length()-i-1))){
				System.out.println("���ǻ�����");
				return;
			}
		}
		System.out.println("�ǻ�����");
	}

}
