
public class number1 {
	static double average(int[] a) throws NullPointerException {
		try {
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			return (((double) sum) / a.length);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			throw e;
		}
	}

	public static void main(String args[]) {
		try {
			int a[] = null;
			average(a);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		System.out.println("OK");

	}
	
}
