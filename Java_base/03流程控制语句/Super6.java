

/*
 6���ж� 101-200 ֮���ж��ٸ����������������������
 ��ν���� n ��ָ���� 1 �� n ֮�⣬���ܱ� 2����n-1��֮����κ�����������
 */
public class Super6 {
	
	public static void main(String[] args) {
		int count=0;
		for(int i=101;i<200;i++)
			if(!number(i)){
				System.out.println(i);
				count++;
			}
		System.out.println("��"+count+"������");
}
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
	
	


