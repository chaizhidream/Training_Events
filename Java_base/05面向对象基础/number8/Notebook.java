package number8;
/*8������һ���ʼǱ��࣬��������ɫ��char���� cpu �ͺţ�int���������ԡ���֪
ʶ�㣺����Ĵ�����ʹ�ã�(1)�޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ��
���Ը�ֵ��
(2) ����ʼǱ���Ϣ�ķ���
Ȼ���дһ�������࣬���ԱʼǱ���ĸ���������
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
		System.out.println("�ʼǱ�����ɫ��"+this.color+"ɫ");
		System.out.println("�ʼǱ����ͺ���"+this.model);
	}
    
}
