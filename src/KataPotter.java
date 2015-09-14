import java.util.ArrayList;

public class KataPotter {

	public static void main(String args[]) {
		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		bookList.add(potterBook1);
		bookList.add(potterBook1);
		Cart cart = new Cart(bookList);
		System.out.println("Price: " + cart.getPrice());
	}
}
