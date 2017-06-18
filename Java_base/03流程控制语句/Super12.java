
/*
12．李先生岁数的平方与他的夫人的岁数之和是 1053，而他的夫人的岁数的平方与他的岁
数之和是 873，请编写程序计算李先生及其夫人的岁数各是多少。
 */
public class Super12 {

	public static void main(String[] args) {
		for (int i = 18; i < 120; i++) {
			for (int j = 18; j < 120; j++) {
				if (i * i + j == 1053 && i + j * j == 873)
					System.out.println("李先生岁数为" + i + "他的夫人的岁数为" + j);
			}
		}

	}
}