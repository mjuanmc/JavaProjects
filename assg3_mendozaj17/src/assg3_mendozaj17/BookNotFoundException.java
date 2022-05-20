package assg3_mendozaj17;

public class BookNotFoundException extends Exception{

	/**
	 * default constructor
	 */
	public BookNotFoundException() {
		super("Can't find book title");
	}

	/**
	 * One-paramter constructor
	 * @param msg the given message
	 */
	public BookNotFoundException(String msg){
		super(msg);
	}
}