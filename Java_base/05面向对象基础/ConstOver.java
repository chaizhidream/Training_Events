

public class ConstOver{    
	public static void main(String[] args){   
		
		Person p=new Person();       
		
		Person q=new Person();      
		p.sayHello();         
		q.sayHello();   
		} 
	
}  

class Person{  
	static int eyeNum; 
	String name;    
	int age;     
	double height;  
	  
		//·Ç¾²Ì¬¿é 
	{
		System.out.println("non-static block");    
		name="zhangsan";       
		age=18;        
		height=1.75;   
	}  
	
	//¾²Ì¬¿é           
	static{        
		System.out.println("static block");    
		eyeNum=2;  
	}      
	
  public Person(){    
	  System.out.println("aaaaaaaaaaaa");   
	  }    
  
  public void sayHello(){    
	  System.out.println("Hello, my name is "+name); 
	  } 
  }


