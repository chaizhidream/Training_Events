/*
10��дһ�����������ܣ�����һ��һά�� int ���飬����Ϊ 3���������������� a,b,c ��ֵ��
����,Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩡�
 */

public class Num10 {

	public static void main(String[] args) {
		int[] n=new int[3];
		System.out.print("ð������ǰ��˳��Ϊ:");
		for (int i = 0; i < n.length; i++) {
			n[i]=(int)(Math.random()*100);
			System.out.print(n[i]+" ");
			}
		//ʹ��ð������
		for (int i = 0; i < n.length-1; i++) {  
	        //ÿһ���ɵ����ϵ�����  
	        for (int j =0 ; j <n.length-i-1; j++){  
	            if (n[j] > n[j+1]){  
	                    int temp=n[j];
	                    n[j]=n[j+1];
	                    n[j+1]=temp;
	            }  
	        }  
	    }  
		System.out.print("ð��������˳��Ϊ:");
		for (int i : n) {
			System.out.print(i+" ");
		}
	}
}
