import java.util.Scanner;

public class mailtest02 {
public static void main(String[] args) {  
	Scanner sc=new Scanner(System.in);
	while (sc.hasNext()) {
          if(mailtest02.testMail(sc.next())){    
			System.out.println("邮箱格式合法"); 
			String sub[] = sc.next().split("@");
			System.out.println("用户名为：" + sub[0]);
			System.out.println("域名为：" + sub[1]);
			}else{     
				System.out.println("邮箱格式不合法");  
			}
	}
	sc.close();
		
		 }

	public static boolean testMail(String s) {

		if (s.indexOf("@") == -1 || s.indexOf(".") == -1) {
			System.out.println("邮箱地址中不包含@或.");
			return false;
		}
		if (s.indexOf("@") != s.lastIndexOf("@") || s.indexOf(".") != s.lastIndexOf(".")) {
			System.out.println("邮箱地址中含有多了@或.");
			return false;
		}
		if (s.indexOf("@") > s.lastIndexOf(".")) {
			System.out.println("邮箱地址中.出现在@的前面");
			return false;
		}
		for (int i = 0; i < s.indexOf("@"); i++) {
			if (!((s.charAt(i) >= 0 && s.charAt(i) <= 9) || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')||s.charAt(i)=='_')) {			
				System.out.println("用户名里有其他字符");
				return false;
            }
		}
		for (int i = s.indexOf("@")+1; i < s.length(); i++) {
			if (!((s.charAt(i) >= 0 && s.charAt(i) <= 9) || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')||s.charAt(i)=='.')) {			
				System.out.println("域名里有其他字符");
				return false;
            }
		}
		return true;
	}
}
