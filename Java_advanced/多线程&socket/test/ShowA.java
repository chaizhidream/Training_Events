package test;

import java.util.Date;

public class ShowA implements Runnable{

	public ShowA() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	
	public void showTime(){
		System.out.println(Thread.currentThread().getName()+"���ʱ��"+new Date());
	}
	
	@Override
	public synchronized void run() {
		for (int i = 0; i <1000; i++) {
			System.out.println(Thread.currentThread().getName()+"  "+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
