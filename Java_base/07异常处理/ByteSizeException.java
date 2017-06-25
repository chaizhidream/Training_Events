public class ByteSizeException extends Exception {

	private static final long serialVersionUID = 1L;

	public ByteSizeException() {
		super("输入的数字不是byte类型");
	}
}