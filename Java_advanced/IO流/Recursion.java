package num5;
import java.io.File;  

//只遍历一层，文件和文件夹分开。
public class Recursion {
	 
	  
	    public static void main(String[] args) {   
	    	String path="F:\\";
	    	System.out.println("路径是 "+path+"的文件夹内的文件有：");  
	    	   File f = new File(path);
	    	   File[] fi=f.listFiles();
	    	   for (File file : fi) {
	    		   
				if (file.isFile()) {
					System.out.println("文件名："+file.getName());
				}
				else{
					System.out.println("文件夹名："+file.getName());
				}
				
				System.out.println("路径名："+file);
				System.out.println("-----------------------------");
			}
	      
	        }
	     
	    }