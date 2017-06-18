&#8195;&#8195;本次作业代码量比较简单，输入项较少。类名“NumberX”,X表示题号。部分实现细节与题干有出入。为了使代码块能直接运行：

1.对于要求输入数据的题目，统一均采用scanner输入流。主要代码块位于while循环内。且运行时可以输入多组测试数据，不用重复编译。

示意如下：


        import java.util.Scanner;
        public class Number01 {
        public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		     while (sc.hasNext()) {
			     //这里是主要的代码块
		     }
		     sc.close();
	      }
        }

2.对于不要求输入数据的题目，直接输出结果。部分题目可能会调用函数。

示意如下：

        public class Number01 {
        public static void main(String[] args) {
		   
			     //这里是主要的代码块
		    
	      }
        }