/*
10、写一个方法，功能：定义一个一维的 int 数组，长度为 3，把任意三个整数 a,b,c 赋值给
数组,然后将它们按从小到大的顺序输出（使用冒泡排序）。
 */

public class Num10 {

	public static void main(String[] args) {
		int[] n=new int[3];
		System.out.print("冒泡排序前的顺序为:");
		for (int i = 0; i < n.length; i++) {
			n[i]=(int)(Math.random()*100);
			System.out.print(n[i]+" ");
			}
		//使用冒泡排序
		for (int i = 0; i < n.length-1; i++) {  
	        //每一次由底至上地上升  
	        for (int j =0 ; j <n.length-i-1; j++){  
	            if (n[j] > n[j+1]){  
	                    int temp=n[j];
	                    n[j]=n[j+1];
	                    n[j+1]=temp;
	            }  
	        }  
	    }  
		System.out.print("冒泡排序后的顺序为:");
		for (int i : n) {
			System.out.print(i+" ");
		}
	}
}
