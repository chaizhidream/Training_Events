
/*
19．猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下
的一半零一个。到第 10 天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。程
序分析：采取逆向思维的方法，从后往前推断。
 */
public class Super19 {

	public static void main(String[] args) {
	int n=10;
	int s=1;
	while (n!=1) {
		s=(s+1)*2;
		n--;
	}
System.out.println("第一天共摘了"+s+"个桃子");
	}
}
