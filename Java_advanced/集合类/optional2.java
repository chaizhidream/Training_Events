
import java.util.LinkedList;
import java.util.Scanner;

public class optional2 {
	public static void main(String[] args) {
		LinkedList<String> arr = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str.equals("")) {
				sc.close();
				System.out.println("�������,���ս��Ϊ��");
				System.out.println(arr);						
				System.exit(0);
			} else {
				if (str.matches("^[a-zA-z]+$")) {
				System.out.println("����һ��ֵ");
				insert(arr, str);
				System.out.println(arr);
			     }else{
				System.out.println("�����ַ����ǺϷ����ʣ�����������");
			        }
				
			}
		}

	}

	private static void insert(LinkedList<String> arr, String s) {
		
		int n = arr.size();
		if (n == 0) {
			arr.add(s);
		} else {
                //System.out.println("����ִ�б���");
                if (compare(s, arr.get(0))) {
	                    arr.addFirst(s);
	                    System.out.println("���뵽ͷ�������򷵻�");
	                    return;
                }else {
	                   //System.out.println("������ͷ�����������");
                }
                
                if (!compare(s,arr.get(n-1))) {
                        arr.addLast(s);
	                    System.out.println("���뵽β�������򷵻�");
                      	return;
                }else {
	                 //  System.out.println("������β�����������");
                }

			for (int i = 1; i < n; i++) {
				//System.out.println("������ʼ");
				if (!compare(s, arr.get(i))) {
					
					//System.out.println("���ֲ��䣬��һ������");
	
				}else {
					//System.out.println("����һ����ֵ");
					
					arr.add(i, s);
					break;
				}
				
			}
		}
		System.out.println("�������");

	}

	private static boolean compare(String s1, String s2) {
		if (s1.toUpperCase().compareTo(s2.toUpperCase()) <= 0) {
			//System.out.println("s1С��s2");
			return true;
		} else {
			//System.out.println("s1����s2");
			return false;
		}

	}
}
