package assg3_mendozaj17;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kbd = new Scanner(System.in);

		try {
			List<Book>bookData = getFileInformation();
			Book [] bookArray = new Book[bookData.size()];
			bookData.toArray(bookArray);
			String bookid = "0";
			do {
				System.out.println("Book id:");
				bookid = kbd.next();
				int n = 0;
				if(Integer.parseInt(bookid)!=0) {
					n = bookSearch(bookArray, bookData.size(), Integer.parseInt(bookid));
					Book reqBook = bookArray[n];
					if (reqBook.getCategory().trim().equals("F")) {
						reqBook.setCategory("fiction");
					}
					else {
						reqBook.setCategory("nonfic");
					}
					System.out.println("Book id:" + reqBook.getBookID());
				}
			}
			while(Integer.parseInt(bookid)!=0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<Book> getFileInformation() throws Exception{
		List<Book>bookinfoList = new ArrayList<Book>();
		BufferedReader br = new BufferedReader(new FileReader("catalog.txt"));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while(line!=null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				String[] splited = line.split("\\s+");
				if(splited.length>0) {
					Book bean = new Book();
					bean.setBookID(splited[0]));
					bookinfoList.add(bean);
				}
				line = br.readLine();
			}
			finally {
				br.close();
			}
			return bookinfoList;
		}
		public static int bookSearch(Book [] bookArray ,int size,int bookId) throws Exception{

			for(int i=0;i<size;i++){

			Book b=bookArray[i];

			if(Integer.parseInt(b.getBookId())==bookId){

			return i;

			}

			}

			throw new BookNotFoundException("Book Not found ");

	}

}
