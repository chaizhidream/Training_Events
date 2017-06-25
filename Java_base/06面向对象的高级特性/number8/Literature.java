package number8;

public class Literature extends Student{
private int speaking;
private int works;

	public Literature(int id, String name, char sex, int age, int speaking, int works) {
		super(id, name, sex, age);
		this.speaking = speaking;
		this.works = works;
	}	
	
	@Override
	public double grade() {
		return speaking*0.35+works*0.35+midTermExam*0.15+finalTermExam*0.15;
	}

	public int getSpeaking() {
		return speaking;
	}
	public void setSpeaking(int speaking) {
		this.speaking = speaking;
	}
	public int getWorks() {
		return works;
	}
	public void setWorks(int works) {
		this.works = works;
	}
	



}
