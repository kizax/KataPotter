import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class KataPotterTest {

	@Test
	public void test_book_none_price_0() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		Cart cart1 = new Cart(bookList);
		assertEquals(0, cart1.getPrice(), 0);

		Cart cart2 = new Cart(null);
		assertEquals(0, cart2.getPrice(), 0);
	}

	@Test
	public void test_book_1_price_100() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		bookList.add(potterBook1);
		Cart cart = new Cart(bookList);
		assertEquals(100, cart.getPrice(), 0);

		bookList.clear();
		PotterBook potterBook2 = new PotterBook(2, 100);
		bookList.add(potterBook2);
		cart = new Cart(bookList);
		assertEquals(100, cart.getPrice(), 0);

		bookList.clear();
		PotterBook potterBook3 = new PotterBook(3, 100);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(100, cart.getPrice(), 0);

		bookList.clear();
		PotterBook potterBook4 = new PotterBook(4, 100);
		bookList.add(potterBook4);
		cart = new Cart(bookList);
		assertEquals(100, cart.getPrice(), 0);

		bookList.clear();
		PotterBook potterBook5 = new PotterBook(5, 100);
		bookList.add(potterBook5);
		cart = new Cart(bookList);
		assertEquals(100, cart.getPrice(), 0);
	}

	@Test
	public void test_book_2_same_book_price_200() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		bookList.add(potterBook1);
		bookList.add(potterBook1);
		Cart cart = new Cart(bookList);
		assertEquals(200, cart.getPrice(), 0);

		bookList.clear();
		PotterBook potterBook2 = new PotterBook(2, 100);
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		cart = new Cart(bookList);
		assertEquals(200, cart.getPrice(), 0);

		bookList.clear();
		PotterBook potterBook3 = new PotterBook(3, 100);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(200, cart.getPrice(), 0);

		bookList.clear();
		PotterBook potterBook4 = new PotterBook(4, 100);
		bookList.add(potterBook4);
		bookList.add(potterBook4);
		cart = new Cart(bookList);
		assertEquals(200, cart.getPrice(), 0);

		bookList.clear();
		PotterBook potterBook5 = new PotterBook(5, 100);
		bookList.add(potterBook5);
		bookList.add(potterBook5);
		cart = new Cart(bookList);
		assertEquals(200, cart.getPrice(), 0);
	}

	@Test
	public void test_book_2_different_book_price_190() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		bookList.add(potterBook1);
		bookList.add(potterBook2);
		Cart cart = new Cart(bookList);
		assertEquals(190, cart.getPrice(), 0);

		bookList.clear();
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(190, cart.getPrice(), 0);

	}

	@Test
	public void test_book_3() {

		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);

		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		Cart cart = new Cart(bookList);
		assertEquals(270, cart.getPrice(), 0);

		bookList.clear();
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(290, cart.getPrice(), 0);

		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(300, cart.getPrice(), 0);

	}
	
	@Test
	public void test_book_4() {

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
		assertEquals(320, cart.getPrice(), 0);

		bookList.clear();
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(380, cart.getPrice(), 0);

		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		cart = new Cart(bookList);
		assertEquals(390, cart.getPrice(), 0);
		
		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(400, cart.getPrice(), 0);

	}
	
	@Test
	public void test_book_5() {

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
		assertEquals(375, cart.getPrice(), 0);

		bookList.clear();
		bookList.add(potterBook2);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(480, cart.getPrice(), 0);

		bookList.clear();
		bookList.add(potterBook1);
		bookList.add(potterBook2);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		cart = new Cart(bookList);
		assertEquals(420, cart.getPrice(), 0);
		
		bookList.clear();
		bookList.add(potterBook1);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		bookList.add(potterBook4);
		cart = new Cart(bookList);
		assertEquals(460, cart.getPrice(), 0);
		
		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook4);
		cart = new Cart(bookList);
		assertEquals(490, cart.getPrice(), 0);
		
		bookList.clear();
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		bookList.add(potterBook3);
		cart = new Cart(bookList);
		assertEquals(500, cart.getPrice(), 0);

	}

}
