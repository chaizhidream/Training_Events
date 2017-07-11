import java.util.Scanner;

/*5、有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的个数。*/

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
		System.out.println("中文字符个数为："+zh);
		System.out.println("英文字符个数为："+en);
		System.out.println("数字字符个数为："+num);
		System.out.println("其他字符个数为："+el);
	}
}
