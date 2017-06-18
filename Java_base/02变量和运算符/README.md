---
title: java_base02
date: 2017-06-14 11:44:07
categories: java
tags: java_base
keywords:
---

## 必做题
1. 下列哪些变量名是合法的？Ab?1, @abc , lname, _int, $25, private, ab*5, #abc 
   答：lname;_int

2. 写出以下表达式的值：  
***
        int a = 2, b = 3, c;c = a / b * 8;
***
        float a = 3.0F, b;b = a / 0;
***    
        double a = 3.0, k;int b = 3, c = 2;k = a / c + b / c;
***
        int a = 3, b = 6, c;
        c = (a++) + (++b) + a * 2 + b * 4;
***
        int a = 10, b=3, c;
        c = ((a % b) == 0) ? ++a * 2:++b * 2;
***
        int a = 5,b;b = 5 << 2;
***
        int a = 0, b = 12345, c = 0xffffffff, d, e, f;   
        d = a & b;
        e = a | b;
        f = b & c;
    
运行代码为：
 
        public static void main(String[] args) {
	
	{
		System.out.println("第一题的结果为：");
		int a1 = 2, b1 = 3, c1;
		c1 = a1 / b1 * 8;
		System.out.println(c1);
	}
	

		{
			System.out.println("第二题的结果为：");
			float a2 = 3.0F, b2;
			b2 = a2 / 0;
			System.out.println(b2);
			/*
			 * 浮点数中中的0不是真正的0或0.0 而是一个很长的，
			 * 可能是0.000000000001或其它，
			 * 所以一个正数除以0.0结果就得很大很大
			 */
		}
	} 
	
	{
		System.out.println("第三题的结果为：");
		double a3 = 3.0, k3;
		int b3 = 3, c3 = 2;
		k3 = a3 / c3 + b3 / c3;
		System.out.println(k3);
	}
	
	{
		System.out.println("第四题的结果为：");
		int a4 = 3, b4 = 6, c4;
		c4 = (a4++) + (++b4) + a4 * 2 + b4 * 4;
		System.out.println(c4);
	}
	
	{
		System.out.println("第五题的结果为：");
		 int a5 = 10, b5=3, c5;
		 c5 = ((a5 % b5) == 0) ? ++a5 * 2:++b5 * 2;
		System.out.println(c5);
	}
	
	{
		System.out.println("第六题的结果为：");
		@SuppressWarnings("unused")
		int a6 = 5,b6 ;
		b6 = 5 << 2;
		System.out.println(b6);
	}
	
	{
		System.out.println("第七题的结果为：");
		 int a7 = 0, b7 = 12345, c7 = 0xffffffff, d7, e7, f7;
		 d7 = a7 & b7;
		 e7 = a7 | b7;
		 f7 = b7 & c7;
		System.out.println(d7);
		System.out.println(e7);
		System.out.println(f7);
	}
	

结果为：
    第一题的结果为：0
    第二题的结果为：Infinity
    第三题的结果为：2.5
    第四题的结果为：46
    第五题的结果为：8
    第六题的结果为：20
    第七题的结果为：0
                  12345
                  12345

3． 写出以下程序的运行结果：（知识点：数据类型及分类、数据类型的转换）

        public class Test {
        public static void main (String args[]) {
        float a = 3.25F, b= -2.5F;
        int c , d;
        c = (int) (a * b);
        d = (byte) 386;
        System.out.println(“c=c” + c);
        System.out.println(“d=” +d);
        }
        }
运行结果为：

        c=c-8
        d=-126
&#8195;&#8195;容量大的数据类型转换为容量小的数据类型时，需要使用强制类型转换，在强制类型转换过程中，源类型的值可能大于目标类型，因此可能造成精度降低或溢出，使用时需注意

4．编写一个程序，求圆的面积，圆的半径由命令行参数输入。（知识点：变量和运算符综合应用、命令行参数配置）

        double r = Double.parseDouble(args[0]);
		double s;
		s=Math.PI*r*r;
		System.out.println(s);

5．华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去 32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。（知识点：变量和运算符综合应用）   

关键代码为：

华氏度变成摄氏度：

        double f; // 华氏温度
        System.out.println((f – 32.0) * 5 / 9);
摄氏度转成华氏度

        double c ; // 摄氏温度
        System.out.println(c * 9.0 / 5 + 32);


6.已知 a,b 均是整型变量，写出将 a,b 两个变量中的值互换的程序。

对于本题而言，只用{int temp=a;a=b;b=temp;}即可，但若要通过调用函数实现，
 
&#8195;&#8195;在C语言中，可以按如下方法轻松实现交换：

        void swap(int&a ,int&b)  
        {  
           int temp;  
           temp = a;  
           a = b;  
           b = temp;  
         }
&#8195;&#8195;需要指出的是，在Java中用这种方法是行不通的，因为“Java对普通类型的变量是不支持引用传递的”。即使调用下面的函数，也不会改变a,b的值。
![](http://www.ixiuer.cn/picture/java/javabase02_1.png)  

一种比较简便的方法是利用数组进行交换，大概示意如下：

![](http://www.ixiuer.cn/picture/java/javabase02_3.png)  


## 选做题
1.说出以下方法实现什么功能：（知识点：三元运算符用法）
    
        public static double myFuction(double a, double b, double c) {
             double result;
             result = (a < b) ? a: b;
             result = (result < c) ? result : c;
             return result;
          }

&#8195;&#8195;答:求三个数中的最小值。

2.假设 a,n 为任意整数（0<n<10），编写一个程序，分别求出表达式 a <<n, a * 2 的 n 次方，A >> n 以及 a / 2 的 n 次方的值，a, n 都是命令行参数。

        int a = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println(a);
        System.out.println(n);
        System.out.println(a <<n );
        System.out.println(a*(int) Math.pow(2.0, (double) n) );
        System.out.println(a >>n );
        System.out.println(a/(int) Math.pow(2.0, (double) n) );

3.输入一个任意的 5 位整数，将它保留到百位，无需四舍五入   

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i/100*100 );

4.输入一个 0～1000 的整数，求各位数的和，例如 345 的结果是 3+4+5＝12

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int x1 = i / 1000;
        int x2 = i / 100 % 10;
        int x3 = i / 10 % 10;
        int x4 = i % 10;
        System.out.println(x1 + x2 + x3 + x4);

5.输入一个任意的大写字母 A~Z，转换为小写字母
 
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
		char c=s.charAt(0);
		  if(c>=65&&c<=90){
			System.out.println((char)(c+32));
			}else{
				System.out.println("输入有误，请重新输入");
			  }	