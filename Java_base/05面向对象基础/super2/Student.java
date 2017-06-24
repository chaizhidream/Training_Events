package super2;

/*2�����һ���� Student���������������ѧ�źͳɼ������һ�����������ճ�
���Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ��
*/

public class Student {
	private String name;
	private int number;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student() {

	}

	public Student(String name, int number, int grade) {
		this.name = name;
		this.number = number;
		this.grade = grade;
	}

	public String toString() {
		return String.format("name=%s, number=%s, grade=%s", name, number, grade);
	}

	public static void sort(Student[] student) {
		int len = student.length;// ѧ������
		int[] a = new int[len];// ��¼����
		
		for (int i = 0; i < len; i++) {
			a[i] = student[i].getGrade();
		}
		// ��ѧ�źͳɼ���Ӧ
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (student[j].getGrade() > student[j - 1].getGrade()) {
					Student temp = student[j];
					student[j] = student[j - 1];
					student[j - 1] = temp;
					
				}

			}

		}

		for (int i = 0; i < 6; i++) {
			System.out.println(student[i].toString());
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student("����", 2142401, 90);
		Student s2 = new Student("����", 2142402, 45);
		Student s3 = new Student("����", 2142403, 52);
		Student s4 = new Student("����", 2142404, 65);
		Student s5 = new Student("����", 2142405, 76);
		Student s6 = new Student("����", 2142406, 95);
		Student[] s = { s1, s2, s3, s4, s5, s6 };
		sort(s);
	}

}
