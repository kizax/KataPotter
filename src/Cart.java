import java.util.ArrayList;

public class Cart {

	private ArrayList<Book> bookList;

	Cart(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public double getPrice() {
		if (bookList == null || bookList.size() == 0) {
			return 0;
		} else
			return 0;
	}
}
