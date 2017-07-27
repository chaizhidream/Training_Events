package test;

public class Test {
public static void main(String[] args) throws InterruptedException {
	ShowA a=new ShowA();
	ShowB b=new ShowB();
	Thread t1=new Thread(a);
	Thread t2=new Thread(b);
//	Thread t3=new Thread(s);
	t1.start();
	t2.start();
	
	//t3.start();
}
}
