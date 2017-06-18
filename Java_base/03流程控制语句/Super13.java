
/*
13．有两个正整数 a 和 b，已知 a*b=2048，求 a、b 各为何值时，a+b 的值最小值。
 */
public class Super13 {

	public static void main(String[] args) {
		int min=2049;
		for (int i = 1; i <= Math.sqrt(2048); i++) {
			if(2048%i==0){
				min =(min<(i+2048/i))? min:(i+2048/i);
			}
		}
		System.out.println("a+b的最小值为"+min);

	}
}