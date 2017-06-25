
public class number2 {
	public static  void isEquals(String s1,String s2) throws NullPointerException{
		if (s1==null||s2==null) {
			throw new NullPointerException();
		}
		
		if (s1.equals(s2)) {
			System.out.println("两者相等");
		}
	}
		
	
	public static void main(String[] args) {
		String s1="hello world";
		String s2="hello world";
		String s3=null;
		try {
			isEquals(s1, s2);
			isEquals(s2, s3);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("比较结束");
			
		}
	}
	
	
}
