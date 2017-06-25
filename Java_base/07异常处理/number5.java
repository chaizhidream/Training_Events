/*5����дӦ�ó��򣬴������д���������������Ϊ�����ͱ�������Ҫ������в���
NumberFormatException �쳣�� ArithmeticException �쳣�����������벻ͬ�Ĳ���ʱ����
�����¸��ֽ����
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

	// ���������ַ����Ƿ�������
	public static boolean check(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
