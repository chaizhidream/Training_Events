package num6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public static void main(String[] args) {

		String path = "E:\\Ñ§Ï°×ÊÁÏ\\test.txt";
		try {
			BufferedReader in = new BufferedReader(new FileReader(path));
			int c = in.read();
			while (c != -1) {
				System.out.print((char) c);
				c = in.read();
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
