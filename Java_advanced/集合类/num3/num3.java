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
		System.out.println("����������Ԫ��Ϊ��"+Collections.max(s));
		System.out.println("��������С��Ԫ��Ϊ��"+Collections.min(s));
		s.sort(null);

s.forEach(i->System.out.println(i));


}
}