package num5;
import java.io.File;  

//ֻ����һ�㣬�ļ����ļ��зֿ���
public class Recursion {
	 
	  
	    public static void main(String[] args) {   
	    	String path="F:\\";
	    	System.out.println("·���� "+path+"���ļ����ڵ��ļ��У�");  
	    	   File f = new File(path);
	    	   File[] fi=f.listFiles();
	    	   for (File file : fi) {
	    		   
				if (file.isFile()) {
					System.out.println("�ļ�����"+file.getName());
				}
				else{
					System.out.println("�ļ�������"+file.getName());
				}
				
				System.out.println("·������"+file);
				System.out.println("-----------------------------");
			}
	      
	        }
	     
	    }