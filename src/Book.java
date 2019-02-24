public class Book {
	public String name;
	public int price;
	
	Book(String name){
		this.name = name;
		price = getPrice(name);
	}

	public int getPrice(String bookname) {
		if(bookname.equals("java"))
			price = 127;
		else if(bookname.equals("web"))
			price = 100;
		return price;
	}
}
