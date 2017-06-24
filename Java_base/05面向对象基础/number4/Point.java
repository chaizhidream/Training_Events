package number4;

/*．4． 定义一个点类 Point，包含 2 个成员变量 x、y 分别表示 x 和 y 坐标，2 个构造器 Point()
和 Point(int x0,y0),以及一个 movePoint（int dx,int dy）方法实现点的位置移动。
*/
public class Point {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
    public void setY(int y) {
		this.y = y;
	}

  public   Point(){
	  
  }

  public   Point(int x0,int y0){
	  this.x=x0;
	  this.y=y0;
  }
	
	public  void movePoint(int dx,int dy){
		 this.x=this.x+dx;
		  this.y=this.y+dy;
	}
	
	public static void main(String[] args) {
		Point p = new Point(20, 30);
	System.out.println("现在点的位置为("+p.getX()+","+p.getY()+")");
	p.movePoint(40, 60);
	System.out.println("移动后的点的位置为("+p.getX()+","+p.getY()+")");
	}

}
