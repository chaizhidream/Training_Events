package number4;
/*(2) SalariedEmployee �� ColaEmployee �����࣬�ù̶����ʵ�Ա���� ���ԣ���н*/
public class SalariedEmployee extends ColaEmployee {
private int fixedSalary;//�̶����ʣ���н

public int getFixedSalary() {
	return fixedSalary;
}

public void setFixedSalary(int fixedSalary) {
	this.fixedSalary = fixedSalary;
}

@Override
public double getSalary(int month) {
	   double salary=0.0;
	 salary=fixedSalary;
	   
	    if (month==birthdayMonth) {
	    	salary+=100;
	    	System.out.println(name+"�����ն��⽱��100");
	    }
		return salary;
}

public SalariedEmployee(String name,int birthdayMonth,int fixedSalary) {
	super(name,birthdayMonth);
	this.fixedSalary=fixedSalary;
	
}

}
