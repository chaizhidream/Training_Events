package number7;
/*7������һ��Բ�� Circle������Բ����Բ��һ������ radius ��ʾ�뾶������һ�� findArea
�������ڼ���Բ�����������һ�������ࡣ���뾶��ֵΪ 5���������Բ�������
*/
public class Circle {
	
private double radius;

public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}

public double  findArea() {
	return Math.PI*radius*radius;
	
}
	

}
