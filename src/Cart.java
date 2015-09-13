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
		} else if (bookList.size() == 2) {
			if (bookList.get(0).getEpisode() == bookList.get(1).getEpisode()) {
				return bookList.get(0).getPrice() + bookList.get(0).getPrice();
			}else{
				return (bookList.get(0).getPrice() + bookList.get(0).getPrice())*0.95;
			}
		}
		return 0;
	}
}
