



public class Number15 {
	/*
        15�� ��дһ�������ҳ����� 200 ����С������
   */
	public static void main(String[] args) {
		for(int i=201;;i++){
			if (!number(i)) {
				System.out.println("���� 200 ����С������Ϊ"+i);
				break;
			}else {
				continue;
			}
		}

	}
//�ж�һ�����ǲ�������������������FALSE���Ǻ�������TRUE
	private static boolean number(int i) {
boolean flag = false;
		
		if (i>1) 
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = true;
				}
			}
		}
			
			
		return flag;
	
}
	
}
