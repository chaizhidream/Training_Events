import java.util.Scanner;

/*5����һ���ַ��������а��������ַ���Ӣ���ַ��������ַ�����ͳ�ƺʹ�ӡ�������ַ��ĸ�����*/

public class num5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
		sum(sc.next());
		}
		sc.close();

	}

	private static void sum(String s) {
		int zh=0,en=0,num=0,el=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);  
			 if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){  
		            en++;  
		        }else if(c >= '0' && c <= '9'){  
		            num++;  
		        }else if(c >= 0x4E00 &&  c <= 0x9FA5){  
		            zh++;  
		        }
		        else{  
		            el++;  
		        }  
		}
		System.out.println("�����ַ�����Ϊ��"+zh);
		System.out.println("Ӣ���ַ�����Ϊ��"+en);
		System.out.println("�����ַ�����Ϊ��"+num);
		System.out.println("�����ַ�����Ϊ��"+el);
	}
}
