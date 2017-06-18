

import java.util.Scanner;

public class Number14 {
	/*
        14． 编写一个程序，求整数 n 的阶乘，例如 5 的阶乘是 1*2*3*4*5
        阶乘的普通实现、递归实现与大数情况下的实现。
   */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n=sc.nextInt();
			System.out.println(fun(n));	
		}
		sc.close();
	}
	//一般方法，累乘法，限数字较小时使用
//	private static int fun(int n) {
//		int sum=1;
//		while(n!=0){
//			sum*=n--;
//		}
//		return sum;
//		}
	
	
//采用递归法求解，限n>0
	/*
	private static int fun(int n) {
		if (n<=1) {
			return 1;
		}
		return n*fun(n-1);
	}
	*/
	
	//数字较大以及负数的情况
	private static String fun(int n) {
	  int digit = 1;      // 位数  
    int temp;           // 阶乘的任一元素与临时结果的某位的乘积结果  
    int i, j, carry;                    // 进位  
    boolean isnavigate = false;         // 输入的数是正数还是负数  
    int[] a = new int[3000];            // 确保保存最终运算结果的数组足够大  
    if(n < 0) {  
        n = -n;  
        isnavigate = true;  
    }  
    a[0] = 1;                           // 将结果先初始化为1  
    for (i = 2; i <= n; i++) {           // 开始阶乘，阶乘元素从2开始依次"登场"  
        // 按最基本的乘法运算思想（从个位到高位逐位相乘，进位）来考虑，将临时结果的每位与阶乘元素相乘  
        for (j = 1, carry = 0; j <= digit; j++) { // carry：进位  
            temp = a[j - 1] * i + carry; // 相应阶乘中的一项与当前所得临时结果的某位//相乘（加上进位）  
            a[j - 1] = temp % 10;       // 更新临时结果的位上信息  
            carry = temp / 10;          // 看是否有进位  
        }  
        while (carry != 0) {            // 如果有进位  
            a[++digit - 1] = carry % 10; // 新加一位，添加信息。位数增1  
            carry = carry / 10;         // 看还能不能进位  
        }  
    }  
    if(isnavigate) { 
    	//如果n为负数 
        if(n % 2 == 1) {  
            System.out.print((-n) + "的阶乘:"+ (-n) +"! = -"); 
        }else {  
            System.out.print((-n) + "的阶乘:"+ (-n) +"! = "); // 负数的偶次方结果为正
        }  
    }else {  
        System.out.print(n + "的阶乘:"+ n +"! = "); // 显示结果  
    }  
    for (j = digit; j >= 1; j--) {  
        System.out.print(a[j - 1]);  //按位输出
    }
	return "运算结束";  
  
	 }

	 
	 
	
}
