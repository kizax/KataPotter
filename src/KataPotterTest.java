import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class KataPotterTest {

	@Test
	public void book_null_price_0_test() {

		Cart cart = new Cart(null);

		double price = cart.getPrice();

		assertEquals(0, price, 0);
	}

	@Test
	public void book_none_price_0_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(0, price, 0);
	}

	@Test
	public void book_1_price_100_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		bookList.add(potterBook1);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(100, price, 0);
	}

	@Test
	public void book_1_1_price_200_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		bookList.add(potterBook1);
		bookList.add(potterBook1);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(200, price, 0);
	}

	@Test
	public void book_1_2_price_190_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		bookList.add(potterBook1);
		bookList.add(potterBook2);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(190, price, 0);

	}

	@Test
	public void book_1_2_3_price_270_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);

		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(270, price, 0);
	}

	@Test
	public void book_2_2_3_price_290_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		bookList.clear();
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(290, cart.getPrice(), 0);
	}

	@Test
	public void book_3_3_3_price_300_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();

		PotterBook potterBook3 = new PotterBook(3, 100);

		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(300, price, 0);

	}

	@Test
	public void book_1_2_3_4_price_320_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);

		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(320, price, 0);
	}

	@Test
	public void book_2_2_3_3_price_380_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();

		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);

		bookList.clear();
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(380, price, 0);
	}

	@Test
	public void book_3_3_3_4_price_390_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(390, price, 0);

	}

	@Test
	public void book_3_3_3_3_price_400_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook3 = new PotterBook(3, 100);
		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(400, price, 0);

	}

	@Test
	public void book_1_2_3_4_5_price_375_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		PotterBook potterBook5 = new PotterBook(5, 100);

		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		bookList.add(potterBook5);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(375, price, 0);
	}

	@Test
	public void book_2_2_3_3_3_price_480_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);

		bookList.clear();
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(480, price, 0);
	}

	@Test
	public void book_1_2_3_3_4_price_420_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		bookList.clear();
		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(420, price, 0);

	}

	@Test
	public void book_1_3_3_4_4_price_460_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		bookList.clear();
		bookList.add(potterBook1);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		bookList.add(potterBook4);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(460, price, 0);
	}

	@Test
	public void book_3_3_3_4_4_price_490_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();

		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(490, price, 0);
	}

	@Test
	public void book_3_3_3_3_3_price_500_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();

		PotterBook potterBook3 = new PotterBook(3, 100);
		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(500, price, 0);

	}

	@Test
	public void book_1_1_2_3_3_4_price_510_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		PotterBook potterBook5 = new PotterBook(5, 100);

		bookList.add(potterBook1);
		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(510, price, 0);
	}

	@Test
	public void book_1_2_2_3_4_5_price_475_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		PotterBook potterBook5 = new PotterBook(5, 100);
		bookList.clear();
		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		bookList.add(potterBook5);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(475, price, 0);
	}

	@Test
	public void book_1_1_2_2_3_3_4_5_price_640_test() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		PotterBook potterBook5 = new PotterBook(5, 100);

		bookList.clear();
		bookList.add(potterBook1);
		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		bookList.add(potterBook5);
		Cart cart = new Cart(bookList);

		double price = cart.getPrice();

		assertEquals(640, price, 0);

	}

}
