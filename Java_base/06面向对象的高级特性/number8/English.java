package number8;

public class English extends Student {
private int speaking;
	
	public English(int id, String name, char sex, int age,int speaking) {
		super(id, name, sex, age);
		this.speaking=speaking;
	}

	@Override
	public double grade() {
		return this.speaking*0.5+midTermExam*0.25+finalTermExam*0.25;
	}

	public int getSpeaking() {
		return speaking;
	}

	public void setSpeaking(int speaking) {
		this.speaking = speaking;
	}

}
