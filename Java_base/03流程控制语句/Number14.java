

import java.util.Scanner;

public class Number14 {
	/*
        14�� ��дһ������������ n �Ľ׳ˣ����� 5 �Ľ׳��� 1*2*3*4*5
        �׳˵���ͨʵ�֡��ݹ�ʵ�����������µ�ʵ�֡�
   */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n=sc.nextInt();
			System.out.println(fun(n));	
		}
		sc.close();
	}
	//һ�㷽�����۳˷��������ֽ�Сʱʹ��
//	private static int fun(int n) {
//		int sum=1;
//		while(n!=0){
//			sum*=n--;
//		}
//		return sum;
//		}
	
	
//���õݹ鷨��⣬��n>0
	/*
	private static int fun(int n) {
		if (n<=1) {
			return 1;
		}
		return n*fun(n-1);
	}
	*/
	
	//���ֽϴ��Լ����������
	private static String fun(int n) {
	  int digit = 1;      // λ��  
    int temp;           // �׳˵���һԪ������ʱ�����ĳλ�ĳ˻����  
    int i, j, carry;                    // ��λ  
    boolean isnavigate = false;         // ����������������Ǹ���  
    int[] a = new int[3000];            // ȷ�����������������������㹻��  
    if(n < 0) {  
        n = -n;  
        isnavigate = true;  
    }  
    a[0] = 1;                           // ������ȳ�ʼ��Ϊ1  
    for (i = 2; i <= n; i++) {           // ��ʼ�׳ˣ��׳�Ԫ�ش�2��ʼ����"�ǳ�"  
        // ��������ĳ˷�����˼�루�Ӹ�λ����λ��λ��ˣ���λ�������ǣ�����ʱ�����ÿλ��׳�Ԫ�����  
        for (j = 1, carry = 0; j <= digit; j++) { // carry����λ  
            temp = a[j - 1] * i + carry; // ��Ӧ�׳��е�һ���뵱ǰ������ʱ�����ĳλ//��ˣ����Ͻ�λ��  
            a[j - 1] = temp % 10;       // ������ʱ�����λ����Ϣ  
            carry = temp / 10;          // ���Ƿ��н�λ  
        }  
        while (carry != 0) {            // ����н�λ  
            a[++digit - 1] = carry % 10; // �¼�һλ�������Ϣ��λ����1  
            carry = carry / 10;         // �����ܲ��ܽ�λ  
        }  
    }  
    if(isnavigate) { 
    	//���nΪ���� 
        if(n % 2 == 1) {  
            System.out.print((-n) + "�Ľ׳�:"+ (-n) +"! = -"); 
        }else {  
            System.out.print((-n) + "�Ľ׳�:"+ (-n) +"! = "); // ������ż�η����Ϊ��
        }  
    }else {  
        System.out.print(n + "�Ľ׳�:"+ n +"! = "); // ��ʾ���  
    }  
    for (j = digit; j >= 1; j--) {  
        System.out.print(a[j - 1]);  //��λ���
    }
	return "�������";  
  
	 }

	 
	 
	
}
