package number1;
/*1����1������һ������ Person����֪ʶ�㣺����Ĵ�����ʹ�ã�
1)����һ������ sayHello()��������Է������ʺ��hello,my name is XXX��
2)���������ԣ����֡���ߡ�����
��2������һ�� PersonCreate �ࣺ
1�������������󣬷ֱ��� zhangsan��33 �꣬1.73��lishi��44��1.74
2���ֱ���ö���� sayHello()������
*/
public class PersonCreate {

		 public static void main(String[] args){
			
			Person p1= new Person();
			p1.setName("zhangsan");
			p1.setAge(33);
			p1.setHeight(1.73);
		    p1.sayHello();
		    
		    Person p2= new Person();
			p2.setName("lishi");
			p2.setHeight(44);
			p2.setHeight(1.74);
		    p2.sayHello();
		}

	}


