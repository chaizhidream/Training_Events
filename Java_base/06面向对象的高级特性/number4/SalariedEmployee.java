package number4;
/*(2) SalariedEmployee ： ColaEmployee 的子类，拿固定工资的员工。 属性：月薪*/
public class SalariedEmployee extends ColaEmployee {
private int fixedSalary;//固定工资，月薪

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
	    	System.out.println(name+"过生日额外奖励100");
	    }
		return salary;
}

public SalariedEmployee(String name,int birthdayMonth,int fixedSalary) {
	super(name,birthdayMonth);
	this.fixedSalary=fixedSalary;
	
}

}
