package num2;

public class Test {

	public static void main(String[] args) {
		Linkeds<Integer> li=new Linkeds<>();
		li.put(4);
		li.put(25);
		li.put(17);
		li.get();
		System.out.println(li.isEmpty());
	}

}
