package number8;
/*����һ�������� 5 ��ѧ����ѧ�������飬ʹ���������������װ���ϵѧ���Ķ���Ȼ��
�����¸�ʽ��������е���Ϣ��*/

public class Test {

	public static void main(String[] args) {
		Student[] s=new Student[5];
		s[0]=new English(101, "Marry", 'Ů', 18, (int)(Math.random()*100));
		s[1]=new English(102, "Jerry", '��', 19, (int)(Math.random()*100));
		s[2]=new Computer(201, "����·", '��', 21,(int)(Math.random()*100),(int)(Math.random()*100));
		s[3]=new Computer(202, "����", '��', 20,(int)(Math.random()*100),(int)(Math.random()*100));
		s[4]=new Literature(301, "��÷÷", 'Ů', 17,(int)(Math.random()*100),(int)(Math.random()*100));
		
		for (Student student : s) {
			student.setMidTermExam((int)(Math.random()*100));
		    student.setFinalTermExam((int)(Math.random()*100));
		    System.out.println(student.toString());
		}
		
		
		
	}

}
