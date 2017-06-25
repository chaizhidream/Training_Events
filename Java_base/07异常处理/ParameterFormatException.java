
public class ParameterFormatException extends Exception {

	private static final long serialVersionUID = 1L;

	ParameterFormatException() {
		super("参数格式异常！");
	}

	public String toString() {
		return "ParameterFomatException";
	}
}
