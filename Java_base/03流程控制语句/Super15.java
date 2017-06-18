
/*
15．一球从 100 米高度自由落下，每次落地后反跳回原高度的一半；
再落下，求它在第 5次落地时，共经过多少米？再反弹弹起多少米？
 */
public class Super15 {

	public static void main(String[] args) {
		double h=100,sum=0;
		for (int i = 0; i < 5; i++) {
			sum+=h;
			h/=2;
		}
		System.out.println("共经过"+sum+"米");
		System.out.println("再反弹弹起"+h+"米");
	}
}

