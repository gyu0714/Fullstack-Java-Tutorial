package blood.transrusion.exception;

public class NotExistException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6088205671545378811L;
	
	public NotExistException() {
		super();
	}

	public static void NotExistException(String msg) {
		System.out.println(msg);
	}
}
