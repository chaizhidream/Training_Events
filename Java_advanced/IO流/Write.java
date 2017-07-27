package num7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		String path = "C:\\test.txt";
		 String path2="D:\\test.txt";
		File fi = new File(path);

		try {
			fi.createNewFile();
			FileWriter fw = new FileWriter(fi);
			fw.write("hello world");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fw = new FileReader(path);
			FileWriter fw2 = new FileWriter(new File(path2),true);
			int c=fw.read();
			while (c!=-1) {
				if ((char)c!='l') {
					fw2.write(c);
				}else {
					fw2.write(c-32);
				}
				
				c=fw.read();
			}
			fw.close();
			fw2.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}