package ticket;

import java.util.concurrent.Callable;

public class Ticket implements Callable<Integer> {
private int count=30;
//synchronized
public  void  sellTicket() throws InterruptedException{
	System.out.println(Thread.currentThread().getName()+"卖出了第"+count--+"号票");
	Thread.sleep(1000);
}



	@Override
	public Integer call() throws Exception {
		while (count!=0) {
			try {
				this.sellTicket();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	
		return null;
	}

}
