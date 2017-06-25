class ParameterNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	ParameterNumberException() {
		super("参数个数异常！");
	}

	public String toString() {
		return "ParameterNumberException";
	}
}
