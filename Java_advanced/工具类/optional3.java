import java.util.Scanner;

/*3． 有一种数叫回文数，正读和反读都一样，如 12321 便是一个回文数。编写一个程序，从
命令行得到一个整数，判断该数是不是回文数。*/
public class optional3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
		isPalindrome(sc.nextInt());
		}
		sc.close();
	}

	//此法接受的数据值有限，若扩大范围，则可用字符串接收输入，先判断字符串是否为数字。
	private static void isPalindrome(int n) {
		String s=String.valueOf(n);
		for (int i = 0; i <=s.length()/2 ; i++) {
			if(!(s.charAt(i)==s.charAt(s.length()-i-1))){
				System.out.println("不是回文数");
				return;
			}
		}
		System.out.println("是回文数");
	}

}
