package oops.test;

public class Book {

	private long bookId;
	private String bookName;
	private String bookCategory;
	private String bookAuthor;
	private double bookPrice;
	
	
	
	public Book() {
		
		System.out.println("This is default constructor!!");
		displayBookInfo(this);
	}

    

	public Book(long bookId, String bookName, String bookCategory, String bookAuthor, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	
	
	public void displayBookInfo(Book obj)
	{
		System.out.println(obj.bookId+" "+obj.bookAuthor+" "+obj.bookPrice+" "+obj.bookCategory);
	}



	public static void main(String[] args) {
		Book book1=new Book();

	}

}
