import java.util.Arrays;

/*
 1． 编写一个简单程序，要求数组长度为 5，分别赋值 10，20，30，40，50，在控制台输
出该数组的值。
 */
public class Num1 {

	public static void main(String[] args) {
	int[] n={10,20,30,40,50};
	//直接打印数组变量，得到的数组在JVM中的引用地址,下面结果输出为：[I@7852e922
	//System.out.println(n);
	//Arrays.toString()可以快速打印数组元素，不过事先要记得import对应的包
	System.out.println(Arrays.toString(n));
	}

}
