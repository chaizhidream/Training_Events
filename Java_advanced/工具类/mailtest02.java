import java.util.Scanner;

public class mailtest02 {
public static void main(String[] args) {  
	Scanner sc=new Scanner(System.in);
	while (sc.hasNext()) {
          if(mailtest02.testMail(sc.next())){    
			System.out.println("�����ʽ�Ϸ�"); 
			String sub[] = sc.next().split("@");
			System.out.println("�û���Ϊ��" + sub[0]);
			System.out.println("����Ϊ��" + sub[1]);
			}else{     
				System.out.println("�����ʽ���Ϸ�");  
			}
	}
	sc.close();
		
		 }

	public static boolean testMail(String s) {

		if (s.indexOf("@") == -1 || s.indexOf(".") == -1) {
			System.out.println("�����ַ�в�����@��.");
			return false;
		}
		if (s.indexOf("@") != s.lastIndexOf("@") || s.indexOf(".") != s.lastIndexOf(".")) {
			System.out.println("�����ַ�к��ж���@��.");
			return false;
		}
		if (s.indexOf("@") > s.lastIndexOf(".")) {
			System.out.println("�����ַ��.������@��ǰ��");
			return false;
		}
		for (int i = 0; i < s.indexOf("@"); i++) {
			if (!((s.charAt(i) >= 0 && s.charAt(i) <= 9) || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')||s.charAt(i)=='_')) {			
				System.out.println("�û������������ַ�");
				return false;
            }
		}
		for (int i = s.indexOf("@")+1; i < s.length(); i++) {
			if (!((s.charAt(i) >= 0 && s.charAt(i) <= 9) || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')||s.charAt(i)=='.')) {			
				System.out.println("�������������ַ�");
				return false;
            }
		}
		return true;
	}
}
