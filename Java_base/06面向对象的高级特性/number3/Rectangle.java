package number3;
//width ��ʾ���ȡ�height ��ʾ���
public class Rectangle extends Sharp {
	private double width;
    private double height;
    public double getHeight() {
    	return height;
    }
    public void setHeight(double height) {
    	this.height = height;
    }
    public double getWidth() {
    	return width;
    }
    public void setWidth(double width) {
    	this.width = width;
    }
    public Rectangle() {
		// TODO �Զ����ɵĹ��캯�����
	}
    public Rectangle(double height,double width,String color) {
    	this.setHeight(height);
    	this.setWidth(width);
		this.color=color;
	}
	

	@Override
	public double getArea() {
		return getHeight()*getWidth();
	}

	@Override
	public double getPer() {
		return 2*(getHeight()+getWidth());
	}

	@Override
	public void showAll() {
		System.out.println("����"+height);
		System.out.println("����"+width);
		System.out.println("��ɫ��"+color);
		System.out.println("�����"+getArea());
		System.out.println("�ܳ���"+getPer());
	}
	
	
   

}
