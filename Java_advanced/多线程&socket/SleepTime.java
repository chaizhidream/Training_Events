import java.util.Date;

public class SleepTime extends Thread  {
	
	public SleepTime() throws InterruptedException {
		int i=0;
		while (true) {
	System.out.println("��ǰʱ���ǣ�"+new Date()+"��"+i+++"��");
	Thread.sleep(1000);
	}
	
	}
	
}

