package number4;

/*��4�� ����һ������ Point������ 2 ����Ա���� x��y �ֱ��ʾ x �� y ���꣬2 �������� Point()
�� Point(int x0,y0),�Լ�һ�� movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ���
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
	System.out.println("���ڵ��λ��Ϊ("+p.getX()+","+p.getY()+")");
	p.movePoint(40, 60);
	System.out.println("�ƶ���ĵ��λ��Ϊ("+p.getX()+","+p.getY()+")");
	}

}
