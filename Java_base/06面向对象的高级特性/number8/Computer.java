package number8;

public class Computer extends Student{

private int writing;
private int ability;

public Computer(int id, String name, char sex, int age) {
	super(id, name, sex, age);
	
	}

public Computer(int id, String name, char sex, int age,int writing,int ability) {
	super(id, name, sex, age);
	this.writing=writing;
	this.ability=ability;
	}

@Override
public double grade() {
	return writing*0.2+midTermExam*0.2+finalTermExam*0.2+ability*0.4;
}


public int getWriting() {
	return writing;
}
public void setWriting(int writing) {
	this.writing = writing;
}
public int getAbility() {
	return ability;
}
public void setAbility(int ability) {
	this.ability = ability;
}



}
