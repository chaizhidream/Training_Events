import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mailtest {

	public static void main(String[] args) {
		mailtest mt = new mailtest();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			mt.testMail(sc.nextLine());
		}
		sc.close();
	}

	private Boolean testMail(String s) {
		boolean flag = false;
		// 匹配邮箱
		String regex = "^[a-zA-Z0-9][([a-zA-Z0-9]|_)]+@([(a-zA-Z0-9)]+\\.)+[a-zA-Z0-9]+[a-zA-Z0-9]$";
		if (s.matches(regex)) {
			String sub[] = s.split("@");
			System.out.println("用户名为：" + sub[0]);
			System.out.println("域名为：" + sub[1]);
			flag = true;
		} else {
			// 是否含有@
			if (!s.contains("@")) {
				System.out.println("邮箱中不含有@");
	     	}

			// 是否含有多个@
			int index = s.indexOf("@");
			if (s.substring(index + 1, s.length()).contains("@")) {
				System.out.println("邮箱中含有多个@");
			}

			// 判断用户名中是否有非法字符
			Pattern p = Pattern.compile("[^(\\w|_)]");			
			String sub = null;		
			Matcher m = null;
			
			try {
				sub = s.substring(0, index);
				m = p.matcher(sub);
			} catch (Exception e) {
				System.out.println("出现其他未知的严重错误");
				e.printStackTrace();
			}
			if (m.find()) {
				System.out.println("邮箱中含有非法字符");
				System.out.println(m.group());
			}

			// 其他错误
			String domainSub = s.substring(index + 1, s.length());
			String regex1 = "^([(a-zA-Z0-9)]+\\.)+[a-zA-Z0-9]+[a-zA-Z0-9]$";
			if (!domainSub.matches(regex1)) {
				System.out.println("域名中出现错误");
			}
			System.out.println("存在其他的错误");
		}
		
		return flag;
	}

}
