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
		// ƥ������
		String regex = "^[a-zA-Z0-9][([a-zA-Z0-9]|_)]+@([(a-zA-Z0-9)]+\\.)+[a-zA-Z0-9]+[a-zA-Z0-9]$";
		if (s.matches(regex)) {
			String sub[] = s.split("@");
			System.out.println("�û���Ϊ��" + sub[0]);
			System.out.println("����Ϊ��" + sub[1]);
			flag = true;
		} else {
			// �Ƿ���@
			if (!s.contains("@")) {
				System.out.println("�����в�����@");
	     	}

			// �Ƿ��ж��@
			int index = s.indexOf("@");
			if (s.substring(index + 1, s.length()).contains("@")) {
				System.out.println("�����к��ж��@");
			}

			// �ж��û������Ƿ��зǷ��ַ�
			Pattern p = Pattern.compile("[^(\\w|_)]");			
			String sub = null;		
			Matcher m = null;
			
			try {
				sub = s.substring(0, index);
				m = p.matcher(sub);
			} catch (Exception e) {
				System.out.println("��������δ֪�����ش���");
				e.printStackTrace();
			}
			if (m.find()) {
				System.out.println("�����к��зǷ��ַ�");
				System.out.println(m.group());
			}

			// ��������
			String domainSub = s.substring(index + 1, s.length());
			String regex1 = "^([(a-zA-Z0-9)]+\\.)+[a-zA-Z0-9]+[a-zA-Z0-9]$";
			if (!domainSub.matches(regex1)) {
				System.out.println("�����г��ִ���");
			}
			System.out.println("���������Ĵ���");
		}
		
		return flag;
	}

}
