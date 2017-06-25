package number3;

/*3������ĸ��࣬�ֱ��ǣ�
 ��1��Shape ��ʾͼ���࣬��������� area���ܳ����� per����ɫ���� color��
���������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ������� 3 �����󷽷���
�ֱ��ǣ�getArea ���������getPer �����ܳ���showAll ���������Ϣ������
һ������ɫ�ķ��� getColor��
��2��2 �����ࣺ
1��Rectangle ��ʾ�����࣬�����������ԣ�Width ��ʾ���ȡ�height ��ʾ��
�ȣ���д getPer��getArea �� showAll ��������������������һ�����췽����һ
����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ���
2��Circle ��ʾԲ�࣬���� 1 �����ԣ�radius ��ʾ�뾶����д getPer��getArea
�� showAll ���������������������������췽����Ϊ�뾶����ɫ��ֵ�ģ���
��3��һ�������� PolyDemo���� main �����У���������ÿ������Ķ��󣬲�
���� 2 ������� showAll ������
 */
public abstract class Sharp {

	protected double area;

	protected double per;
	protected String color;

	public Sharp() {

	}

	public Sharp(String color) {
		this.color = color;
	}

	public abstract double getArea();

	public abstract double getPer();

	public abstract void showAll();

	public String getColor() {
		return color;
    }

}
