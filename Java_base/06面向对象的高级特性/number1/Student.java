package number1;

public class Student extends Person{
private double score;
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}
public Student(String s, int i, double d) {
	super(s, i, d);
}

public Student(String s, int i, double d,int score) {
	super(s, i, d);
	this.score=score;
}
public void study(){
	System.out.println("我在学习");
}
	public static void main(String[] args) {
	Student s=new Student("张三",21,54.6,95);
	s.study();
    s.sayHello();
	}

}
