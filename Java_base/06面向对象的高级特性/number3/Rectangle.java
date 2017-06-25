package number3;
//width 表示长度、height 表示宽度
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
		// TODO 自动生成的构造函数存根
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
		System.out.println("长是"+height);
		System.out.println("宽是"+width);
		System.out.println("颜色是"+color);
		System.out.println("面积是"+getArea());
		System.out.println("周长是"+getPer());
	}
	
	
   

}
