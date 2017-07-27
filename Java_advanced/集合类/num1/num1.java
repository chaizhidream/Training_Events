package num1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class num1 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> s = new ArrayList<String>();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String input =reader.readLine();
		String[] words=input.split(" ");
		for (String string : words) {
			if (string.matches("[A-Za-z]+")) {
				s.add(string);
			}			
		}
		reader.close();
		s.sort((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()));
		System.out.println(s);
	}
}
