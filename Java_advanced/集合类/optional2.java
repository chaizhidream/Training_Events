
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
				System.out.println("程序结束,最终结果为：");
				System.out.println(arr);						
				System.exit(0);
			} else {
				if (str.matches("^[a-zA-z]+$")) {
				System.out.println("插入一个值");
				insert(arr, str);
				System.out.println(arr);
			     }else{
				System.out.println("输入字符不是合法单词，请重新输入");
			        }
				
			}
		}

	}

	private static void insert(LinkedList<String> arr, String s) {
		
		int n = arr.size();
		if (n == 0) {
			arr.add(s);
		} else {
                //System.out.println("马上执行遍历");
                if (compare(s, arr.get(0))) {
	                    arr.addFirst(s);
	                    System.out.println("插入到头部，程序返回");
	                    return;
                }else {
	                   //System.out.println("不插入头部，程序继续");
                }
                
                if (!compare(s,arr.get(n-1))) {
                        arr.addLast(s);
	                    System.out.println("插入到尾部，程序返回");
                      	return;
                }else {
	                 //  System.out.println("不插入尾部，程序继续");
                }

			for (int i = 1; i < n; i++) {
				//System.out.println("遍历开始");
				if (!compare(s, arr.get(i))) {
					
					//System.out.println("保持不变，下一个遍历");
	
				}else {
					//System.out.println("插入一个新值");
					
					arr.add(i, s);
					break;
				}
				
			}
		}
		System.out.println("遍历完毕");

	}

	private static boolean compare(String s1, String s2) {
		if (s1.toUpperCase().compareTo(s2.toUpperCase()) <= 0) {
			//System.out.println("s1小于s2");
			return true;
		} else {
			//System.out.println("s1大于s2");
			return false;
		}

	}
}
