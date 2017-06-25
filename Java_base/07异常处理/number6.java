
public class number6 {
	
	public static void  foo(int number) throws ByteSizeException{
		if (number>127||number<-128) {
			throw new ByteSizeException();
		}
	}
	
	
	public static void  main(String[] args) {
		try {
			foo(240);
		} catch (ByteSizeException e) {
			e.printStackTrace();
		}
		
	}
}


