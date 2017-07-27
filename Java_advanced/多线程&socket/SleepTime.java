import java.util.Date;

public class SleepTime extends Thread  {
	
	public SleepTime() throws InterruptedException {
		int i=0;
		while (true) {
	System.out.println("当前时间是："+new Date()+"第"+i+++"次");
	Thread.sleep(1000);
	}
	
	}
	
}

