//import java.util.Arrays;

/*
 2�� ���һ�� double �Ͷ�ά���飨���ȷֱ�Ϊ 5��4��ֵ�Լ��趨����ֵ��
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
	//ֱ�Ӵ�ӡ����������õ���������JVM�е����õ�ַ,���������Ϊ��[I@7852e922
	//System.out.println(n);
	//Arrays.toString()���Կ��ٴ�ӡ����Ԫ�أ���������Ҫ�ǵ�import��Ӧ�İ�
	//������Ҫ�ᵽ��һ�������������ά���� ����ô��Ҫ��Arrays.deepToString()
	//System.out.println(Arrays.deepToString(n));
	}

}
