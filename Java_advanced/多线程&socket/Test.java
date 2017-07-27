
public class Test {

	public static void main(String[] args) {
		SleepTime s = null;
  try {
	s=new SleepTime();
} catch (InterruptedException e) {
	e.printStackTrace();
}
  s.start();
  
	}

}
