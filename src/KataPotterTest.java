import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class KataPotterTest {

	@Test
	public void test_book_none_price_0() {

		ArrayList<Book> bookList = new ArrayList<Book>();
		Cart cart1 = new Cart(bookList);
		assertEquals(0, cart1.getPrice(), 0);

		Cart cart2 = new Cart(null);
		assertEquals(0, cart2.getPrice(), 0);
	}

}
