package number8;
/*定义一个可容纳 5 个学生的学生类数组，使用随机数给该数组装入各系学生的对象，然后
按如下格式输出数组中的信息：*/

public class Test {

	public static void main(String[] args) {
		Student[] s=new Student[5];
		s[0]=new English(101, "Marry", '女', 18, (int)(Math.random()*100));
		s[1]=new English(102, "Jerry", '男', 19, (int)(Math.random()*100));
		s[2]=new Computer(201, "王大路", '男', 21,(int)(Math.random()*100),(int)(Math.random()*100));
		s[3]=new Computer(202, "李大可", '男', 20,(int)(Math.random()*100),(int)(Math.random()*100));
		s[4]=new Literature(301, "韩梅梅", '女', 17,(int)(Math.random()*100),(int)(Math.random()*100));
		
		for (Student student : s) {
			student.setMidTermExam((int)(Math.random()*100));
		    student.setFinalTermExam((int)(Math.random()*100));
		    System.out.println(student.toString());
		}
		
		
		
	}

}
