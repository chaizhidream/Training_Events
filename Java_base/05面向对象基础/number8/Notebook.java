package number8;
/*8、定义一个笔记本类，该类有颜色（char）和 cpu 型号（int）两个属性。（知
识点：对象的创建和使用）(1)无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个
属性赋值；
(2) 输出笔记本信息的方法
然后编写一个测试类，测试笔记本类的各个方法。
*/
public class Notebook {
	
    private char color;
    private int model;
    
    public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	public Notebook() {

	}
	
	public Notebook(char color, int model) {
		this.color = color;
		this.model = model;
	}

	public void information() {
		System.out.println("笔记本的颜色是"+this.color+"色");
		System.out.println("笔记本的型号是"+this.model);
	}
    
}
