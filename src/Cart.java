import java.util.ArrayList;

public class Cart {

	private ArrayList<PotterBook> bookList;

	Cart(ArrayList<PotterBook> bookList) {
		this.bookList = bookList;
	}

	public double getPrice() {
		if (bookList == null || bookList.size() == 0) {
			return 0;
		} else if (bookList.size() == 1) {
			return bookList.get(0).getPrice();
		} else {
			return 0;
		}
	}
}
