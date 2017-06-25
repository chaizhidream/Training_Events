package number8;

//学号:XXXXXXXX 姓名：XXX 性别：X 年龄：XX 综合成绩：XX
public abstract class Student {
	protected int id;
	protected String name;
	protected char sex;
	protected int age;
	protected int grade;
	protected int midTermExam;
	protected int finalTermExam;

	public Student(int id, String name, char sex, int age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public abstract double grade();

	public String toString() {
		return "学号:" + id + " 姓名:" + name + " 性别:" + sex + " 年龄:" + age + " 综合成绩为:" + grade();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMidTermExam() {
		return midTermExam;
	}

	public void setMidTermExam(int midTermExam) {
		this.midTermExam = midTermExam;
	}

	public int getFinalTermExam() {
		return finalTermExam;
	}

	public void setFinalTermExam(int finalTermExam) {
		this.finalTermExam = finalTermExam;
	}

}
