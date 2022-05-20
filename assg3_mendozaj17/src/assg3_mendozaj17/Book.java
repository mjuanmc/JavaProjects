package assg3_mendozaj17;

public class Book {
	
	private int bookID;
	private String bookTitle;
	private String iSBN;
	private String lastAuthor;
	private char category;
		
	/**
	 * Constructor with given id, title, isbn, last, and cat
	 * @param given id
	 * @param given title
	 * @param given isbn
	 * @param given last
	 * @param given cat
	 */
	public Book(int id, String title, String isbn, String last, char cat) {
		super();
		this.bookID = id;
		this.bookTitle = title;
		this.iSBN = isbn;
		this.lastAuthor = last;
		this.category = cat;
	}
	
	/**
	 * retrieves bookID
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}
	
	/**
	 * sets the new bookID
	 * @param bookID is the new ID.
	 */
	public void setBookID(int iD) {
		this.bookID = iD;
	}
	
	
	/**
	 * retrieves title 
	 * @return the book title
	 */
	public String getTitle() {
		return bookTitle;
	}

	/**
	 * set the book title
	 * @param the title
	 */
	public void setTitle(String title) {
		this.bookTitle = title;
	}
	
	
	/**
	 * retrieve the ISBN
	 * @return the isbn
	 */
	public String getISBN() {
		return iSBN;
	}

	/**
	 * sets the ISBN
	 * @param the new ISBN
	 */
	public void setISBN(String ISBN) {
		this.iSBN = ISBN;
	}
	

	/**
	 * retrieves the last name of author
	 * @return the last name. 
	 */
	public String getLastAuthor() {
		return lastAuthor;

	}
	
	/**
	 * sets the new last name 
	 * @param is the new last name
	 */
	public void setLastAuthor(String last) {
		this.lastAuthor = last;
	}
	
	/**
	 * retrieves the category
	 * @return retrieves the category.
	 */
	public char getCategory() {
		return category;
	}

	/**
	 * sets the new category
	 * @param cat is the new cat
	 */
	public void setCategory(char cat) {
		this.category = cat;
	}
	
	
	/**
	 * toString to print out contents
	 * @return result is the outcome. 
	 */
	@Override
	public String toString() {
	
		return "Book id: " + bookID + ", Title: " + bookTitle + ", ISBN: " + iSBN + ", Author: " + lastAuthor + category;
	}
	
	public static int bookSearch(Book books[], int size, int bookID) throws BookNotFoundException {
		for(int i = 0; i < size; i++) {
			if(books[i].getBookID() == bookID)  
				return i;
		}
		throw new BookNotFoundException("No such book");
	}
	
}