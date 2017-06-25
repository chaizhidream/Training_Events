/*5．编写应用程序，从命令行传入两个整型数作为除数和被除数。要求程序中捕获
NumberFormatException 异常和 ArithmeticException 异常在命令行输入不同的参数时能输
出如下各种结果：
*/
public class number5 {
	public static void main(String args[]) throws NumberFormatException, ArithmeticException {
		try {
			if (!check(args[0]) || !check(args[1])) {
				throw new NumberFormatException();
			} else {
				if (args[1].equals("0")) {
					throw new ArithmeticException();
				}
			}
			double n1 = Double.valueOf(args[0]);
			double n2 = Double.valueOf(args[1]);
			System.out.println(n1 / n2);
		} catch (NumberFormatException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

	// 检测输入的字符串是否都是整数
	public static boolean check(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
