//import java.util.Arrays;

/*
 2． 输出一个 double 型二维数组（长度分别为 5、4，值自己设定）的值。
 */
public class Num2 {

	public static void main(String[] args) {
	double[][] n=new double[5][4];
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 4; j++) {
			n[i][j]=Math.random();
			System.out.print(n[i][j]);
		}
		System.out.println();
	}
	//直接打印数组变量，得到的数组在JVM中的引用地址,下面结果输出为：[I@7852e922
	//System.out.println(n);
	//Arrays.toString()可以快速打印数组元素，不过事先要记得import对应的包
	//另外需要提到的一点是如果遍历多维数组 ，那么需要用Arrays.deepToString()
	//System.out.println(Arrays.deepToString(n));
	}

}
