/*
 4．
有2个多维数组分别是 
2 3 4 
4 6 8
和 
1 5  2   8
5 9 10  -3
2 7 -5 -18
按照如下方式进行运算。生成一个 2 行 4 列的数组。
此数组的第 1 行 1 列是 2*1+3*5+4*2
第 1 行 2 列是 2*5+3*9+4*7 
第 2 行 1 列是 4*1+6*5+8*2 
依次类推。
 */
public class Super4 {

	public static void main(String[] args) {  

      int[][] n={{2,3,4},{4,6,8}};
      int[][] m={{1,5,2,8},{5,9,10,-3},{2,7,-5,18}};
      int[][] s=new int[2][4];
      int temp=0;
      for (int i = 0; i < 2; i++) {
    	  for (int j = 0; j < 4; j++) {
    		  temp=n[i][0]*m[0][j]+n[i][1]*m[1][j]+n[i][2]*m[2][j];
    		  s[i][j]=temp;
    			System.out.println("此数组的第"+(i+1)+"行"+(j+1)+"列是："+n[i][0]+"*"+m[0][j]+"+"+n[i][1]+"*"+m[1][j]+"+"+n[i][2]+"*"+m[2][j]+"="+temp);
    	        }		
    	  }  
      System.out.println("数组为：");
    for (int i = 0; i < 2; i++) {
    	for (int j = 0; j < 4; j++) {
    		    	System.out.print(s[i][j]+" ");	  
    	}
    	System.out.println();
    }
	

      
    }  
  
}