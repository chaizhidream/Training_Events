package ticket;

public class Test {
public static void main(String[] args) {
	Ticket t=new Ticket();
	Ticket t2=new Ticket();
	try {
		t.call();
		t2.call();
	} catch (Exception e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
	
}
}
