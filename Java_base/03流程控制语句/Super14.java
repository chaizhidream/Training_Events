
/*
14．用 1、2、3、4 能组成多少无重复数字的三位数
 */
public class Super14 {

	public static void main(String[] args) {
		 int count = 0;
	        for (int x = 1; x < 5; x++) {
	            for (int y = 1; y < 5; y++) {
	                for (int z = 1; z < 5; z++) {
	                    if (x != y && y != z && x != z) {
	                        count++;
	                        System.out.println(x * 100 + y * 10 + z + "   ");
	                    }
	                }
	            }
	        }
        System.out.println(" 能组成"+count+"个无重复数字的三位数");
	}
}

