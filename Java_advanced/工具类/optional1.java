
public class optional1 {

	  public static void main(String[] args) {  
	        String srcStr1 = "��ABC";  
	        String srcStr2 = "��ABC��DEF";  
	  
	        splitString(srcStr1, 4);  
	        splitString(srcStr2, 6);  
	    }  
	  
	    public static void splitString(String src, int len) {  
	        int byteNum = 0;  
	  
	        if ( src==null) {  
	            System.out.println("The source String is null!");  
	            return;  
	        }  
	  
	        byteNum = src.length();  
	        byte bt[] = src.getBytes(); // ��Stringת����byte�ֽ�����  
	  
	        if (len > byteNum) {  
	            len = byteNum;  
	        }  
	  
	        // �ж��Ƿ�����˽ذ룬�ذ�Ļ��ֽڶ��ڵ�ASC����С��0��ֵ  
	        if (bt[len] < 0) {  
	            String subStrx = new String(bt, 0, --len);  
	            System.out.println("subStrx==" + subStrx);  
	        } else {  
	            String subStrx = new String(bt, 0, len);  
	            System.out.println("subStrx==" + subStrx);  
	        }  
	    }  
	  

}
