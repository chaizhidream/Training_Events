/*
 4��
��2����ά����ֱ��� 
2 3 4 
4 6 8
�� 
1 5  2   8
5 9 10  -3
2 7 -5 -18
�������·�ʽ�������㡣����һ�� 2 �� 4 �е����顣
������ĵ� 1 �� 1 ���� 2*1+3*5+4*2
�� 1 �� 2 ���� 2*5+3*9+4*7 
�� 2 �� 1 ���� 4*1+6*5+8*2 
�������ơ�
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
    			System.out.println("������ĵ�"+(i+1)+"��"+(j+1)+"���ǣ�"+n[i][0]+"*"+m[0][j]+"+"+n[i][1]+"*"+m[1][j]+"+"+n[i][2]+"*"+m[2][j]+"="+temp);
    	        }		
    	  }  
      System.out.println("����Ϊ��");
    for (int i = 0; i < 2; i++) {
    	for (int j = 0; j < 4; j++) {
    		    	System.out.print(s[i][j]+" ");	  
    	}
    	System.out.println();
    }
	

      
    }  
  
}