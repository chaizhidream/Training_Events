
public class number3 {
	public static void main(String args[]) throws ParameterNumberException, ParameterFormatException {

		try {
			if (args.length != 2) {
				throw new ParameterNumberException();
			} else {
				if (!check(args[0]) || !check(args[1])) {
					throw new ParameterFormatException();
				}
			}
			System.out.println(args[0] + " " + args[1]);
		} catch (ParameterNumberException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (ParameterFormatException e) {
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