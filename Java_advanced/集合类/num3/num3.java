package num3;
import java.util.ArrayList;
import java.util.Collections;

public class num3 {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("apple");
		s.add("grape");
		s.add("banana");
		s.add("pear");
		System.out.println("集合中最大的元素为："+Collections.max(s));
		System.out.println("集合中最小的元素为："+Collections.min(s));
		s.sort(null);

s.forEach(i->System.out.println(i));


}
}