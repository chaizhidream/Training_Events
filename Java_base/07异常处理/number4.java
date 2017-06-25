
public class number4 {
	public void example() {
		try {
			unsafe();
			System.out.println("Test 1");
		} catch (Exception e) {
			System.out.println("Test 2");
		} finally {
			System.out.println("Test 3");
		}
		System.out.println("Test 4");
	}

	private void unsafe() {
		
	}
	
	public static void  main(String[] args) {
		new number4().example();
		
	}
	
	
}
