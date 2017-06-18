

import java.util.Scanner;

/*
 2．3． 由命令行输入一个 4 位整数，求将该数反转以后的数，如原数为 1234，反转后的数位4321
 华为机试题原题：
 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class Super3 {

	  public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				System.out.println(new StringBuffer(Integer.toString(sc.nextInt())).reverse().toString());
			}
			//输出为字符串形式，若要按整数输出，增加一行 将字符串变为整数
			// int a = Integer.parseInt(s);
			sc.close();
		  }	
	}

