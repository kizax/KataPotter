import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class KataPotterTest {

	@Test
	public void test_book_none_price_0() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		Cart cart = new Cart(bookList);

		assertEquals(0, cart.getPrice(), 0);
	}

}
