import java.util.Scanner;

public class optional2 {
	private static String[] numArr = new String[] { "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
	private static final String[] units = new String[] { "圆", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟",
			"万", "拾", "佰", "仟", "万", };

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
		String s=sc.next();
		System.out.println(convert(s));
		}
		sc.close();
	}

	public static String fourNumerToString(String num, String unit) {
		StringBuilder buf = new StringBuilder();
		for (int i = num.length() - 1; i >= 0; i--) {
			if (num.charAt(i) > '0') {
				String cell = numArr[num.charAt(i) - '1'];
				if (i != num.length() - 1)
					cell += (units[num.length() - 1 - i]);
				buf.insert(0, cell);
			} else {
				if (buf.length() == 0)
					continue;
				else {
					if (buf.charAt(0) == '零')
						continue;
					else
						buf.insert(0, '零');
				}
			}
		}
		buf.append(unit);
		return buf.toString();
	}

	public static String decimalToString(String decstr) {
		if (decstr.length() > 2)
			decstr = decstr.substring(0, 2);
		String str = "";
		int jiao = decstr.charAt(0) - '0';
		if (jiao > 0)
			str += numArr[jiao - 1] + "角";
		int fen = 0;
		if (decstr.length() == 2)
			fen = decstr.charAt(1) - '0';
		if (jiao > 0)
			str += numArr[fen - 1] + "分";
		return str;
	}

	public static String convert(String amount) {
		int idx = amount.indexOf('.');
		String amtintstr = amount;
		String amtdecstr = "";
		StringBuilder buff = new StringBuilder();
		if (idx > -1) {
			amtintstr = amount.substring(0, idx);
			amtdecstr = amount.substring(idx + 1);
			String decstr = decimalToString(amtdecstr); // 处理小数金额
			if (decstr.length() == 0)
				buff.append("整");
			else
				buff.append(decstr);
		} else
			buff.append("整");
		int pos = 0;
		while (amtintstr.length() > 4) // 处理4位的数字
		{
			String fivenum = amtintstr.substring(amtintstr.length() - 4, amtintstr.length());
			buff.insert(0, fourNumerToString(fivenum, units[pos]));
			amtintstr = amtintstr.substring(0, amtintstr.length() - 4);
			pos += 4;
		}
		buff.insert(0, fourNumerToString(amtintstr, units[pos]));
		return buff.toString();
	}

}
