



/*
 5����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
 ���磺153 ��һ��"ˮ�ɻ���"����Ϊ 153=1 �����η���5 �����η���3 �����η���
 */
public class Super5 {

	  public static void main(String[] args) {
			for(int i=100;i<=999;i++)
				if(flower(i)){
					System.out.println(i);
				}
	}

	private static boolean flower(int i) {
		boolean flag=false;
		int a=i/100;
		int b=(i-a*100)/10;
		int c=i%10;
		if(a*a*a+b*b*b+c*c*c-i==0){
			flag=true;
		}
		return flag;
	}
	
	
}

