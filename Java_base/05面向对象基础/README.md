### 编程题
&#8195;&#8195;编程题代码位于numberX文件夹内，X代表题号；  
### 选择题
&#8195;&#8195;选择题答案为：
1.C
2.E
3.AC
4.A
5.C
6.D

### 程序分析题

1)

    public class CircleStatic {
	    static double pi = 3.14;
	    int radius = 100;

	public static void main(String[] args) {
		System.out.println(pi); // 打印pi
		CircleStatic c = new CircleStatic();
		System.out.println(c.radius); // 打印radius
	   }
    }

输出为：

    3.14
    100

2)详见文件CircleStatic.java，输出为：

     3.14
     100
     0

3)详见文件ConstOver.java，输出为：

    static block
    non-static block
    aaaaaaaaaaaa
    non-static block
    aaaaaaaaaaaa
    Hello, my name is zhangsan
    Hello, my name is zhangsan