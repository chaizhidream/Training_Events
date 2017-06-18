

public class Number16 {
	/*
	 * 16．假设某员工今年的年薪是 30000 元，年薪的年增长率 6%。编写一个 Java 应用程序计算 该员工 10 年后的年薪，并统计未来 10
	 * 年（从今年算起）总收入。
	 */
	public static void main(String[] args) {
		int sal = 30000;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum = sum + sal;
			sal *= 1.06;
		}
		System.out.println("10年后的年薪为" + sal + "元");
		System.out.println("10年的总收入为" + sum + "元");
	}

}
