

/*
10.打印出如下图案（菱形）
 */
public class Super10 {

	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
			System.out.print(j);
			}
			for (int j = 1; j <=6- i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=6; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 7-i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <=i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=6; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=6- i; j++) {
				System.out.print(" ");
			}	
			for (int j = i; j>=1; j--) {
				System.out.print(j);
			}
			for (int j = 1; j <=6; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 7-i; j++) {
				System.out.print(j);
			}
			
			
			
			System.out.println();
		}
	}
}