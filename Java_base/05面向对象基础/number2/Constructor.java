package number2;

/* 
2����1������һ������ Person����֪ʶ�㣺����Ĵ�����ʹ�ã�
      1)����һ������ sayHello()��������Է������ʺ��hello,my name is XXX��
      2)���������ԣ�����,����,���
      3)ͨ�����췽�����ֱ���������Ը�ֵ
       ��2������һ�� Constructor �ࣺ
      1�������������󣬷ֱ��� zhangsan��33 �꣬1.73��lishi��44��1.74
      2���ֱ���ö���� sayHello()������
*/
public class Constructor {

	public static void main(String[] args) {
		Person p1 = new Person("zhangsan", 33, 1.73);
		p1.sayHello();
		Person p2 = new Person("lishi", 44, 1.74);
		p2.sayHello();
	}

}
