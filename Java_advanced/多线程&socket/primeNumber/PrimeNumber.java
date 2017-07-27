package primeNumber;

import java.util.TreeSet;


public class PrimeNumber {
    private Integer mutex = 1;
    private static TreeSet<Integer> ts;
    private static int num = 0;
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
       ts=new TreeSet<Integer>();
        Prime t1 = pn.new Prime(1, 1000);
        Prime t2 = pn.new Prime(1000, 2000);
        Prime t3 = pn.new Prime(2000, 3000);
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("共有"+num+"个素数,从小到大依次为：");    
	    ts.forEach(i->  System.out.println(i));
	    System.out.println("共有"+num+"个素数");   
		
    }
    
    //内部类
private    class Prime extends Thread {
        private int start;
        private int end;
        public Prime(int start, int end) {
            this.start = start;
            this.end = end;
        }
        public void run() {
            for (int i = start+1; i < end; i++) {
                synchronized (mutex) {          
                    boolean flag = true;
                    for (int j = 2; j <=Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            flag = false;
                        }
                    }
                
                    if (flag||start==2) {
                        num++;
                      ts.add(i);
                      System.out.print(Thread.currentThread().getName()+"找到了");
                        System.out.println(i + "是素数");
                    }
                }
            }
        }
    }
    
    

}