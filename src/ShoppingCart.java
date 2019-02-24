import java.util.ArrayList;

public class ShoppingCart {
	public int id;
	public int count;
	public int value;
	ArrayList <Book> booklist;
	
	ShoppingCart(int id){
		this.id = id;
		count = 0;
		value = 0;
		booklist = new ArrayList <Book>();
	}

	public void addBook(String name, int number) {
		for(int i=0; i<number; i++) {
			Book book = new Book(name);
			booklist.add(book);
			count ++;
			value += book.getPrice(name);
		}
	}

}
