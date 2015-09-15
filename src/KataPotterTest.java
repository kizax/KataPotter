import static org.junit.Assert.*;
import org.junit.Test;

public class KataPotterTest {

	private static PotterBook potterBook1 = new PotterBook(1, 100);
	private static PotterBook potterBook2 = new PotterBook(2, 100);
	private static PotterBook potterBook3 = new PotterBook(3, 100);
	private static PotterBook potterBook4 = new PotterBook(4, 100);
	private static PotterBook potterBook5 = new PotterBook(5, 100);

	@Test
	public void book_null_price_0_test() {

		Cart cart = new Cart(null);

		double price = cart.getPrice();

		assertEquals(0, price, 0);
	}

	@Test
	public void book_none_price_0_test() {

		Cart cart = new Cart();

		double price = cart.getPrice();

		assertEquals(0, price, 0);
	}

	@Test
	public void book_1_price_100_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);

		double price = cart.getPrice();

		assertEquals(100, price, 0);
	}

	@Test
	public void book_1_1_price_200_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook1);

		double price = cart.getPrice();

		assertEquals(200, price, 0);
	}

	@Test
	public void book_1_2_price_190_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook2);

		double price = cart.getPrice();

		assertEquals(190, price, 0);

	}

	@Test
	public void book_1_2_3_price_270_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook2);
		cart.add(potterBook3);

		double price = cart.getPrice();

		assertEquals(270, price, 0);
	}

	@Test
	public void book_2_2_3_price_290_test() {

		Cart cart = new Cart();
		cart.add(potterBook2);
		cart.add(potterBook2);
		cart.add(potterBook3);

		double price = cart.getPrice();

		assertEquals(290, price, 0);
	}

	@Test
	public void book_3_3_3_price_300_test() {

		Cart cart = new Cart();
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);

		double price = cart.getPrice();

		assertEquals(300, price, 0);

	}

	@Test
	public void book_1_2_3_4_price_320_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook2);
		cart.add(potterBook3);
		cart.add(potterBook4);

		double price = cart.getPrice();

		assertEquals(320, price, 0);
	}

	@Test
	public void book_2_2_3_3_price_380_test() {

		Cart cart = new Cart();
		cart.add(potterBook2);
		cart.add(potterBook2);
		cart.add(potterBook3);
		cart.add(potterBook3);

		double price = cart.getPrice();

		assertEquals(380, price, 0);
	}

	@Test
	public void book_3_3_3_4_price_390_test() {

		Cart cart = new Cart();
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook4);

		double price = cart.getPrice();

		assertEquals(390, price, 0);

	}

	@Test
	public void book_3_3_3_3_price_400_test() {

		Cart cart = new Cart();
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);

		double price = cart.getPrice();

		assertEquals(400, price, 0);

	}

	@Test
	public void book_1_2_3_4_5_price_375_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook2);
		cart.add(potterBook3);
		cart.add(potterBook4);
		cart.add(potterBook5);

		double price = cart.getPrice();

		assertEquals(375, price, 0);
	}

	@Test
	public void book_2_2_3_3_3_price_480_test() {

		Cart cart = new Cart();
		cart.add(potterBook2);
		cart.add(potterBook2);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);

		double price = cart.getPrice();

		assertEquals(480, price, 0);
	}

	@Test
	public void book_1_2_3_3_4_price_420_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook2);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook4);

		double price = cart.getPrice();

		assertEquals(420, price, 0);

	}

	@Test
	public void book_1_3_3_4_4_price_460_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook4);
		cart.add(potterBook4);

		double price = cart.getPrice();

		assertEquals(460, price, 0);
	}

	@Test
	public void book_3_3_3_4_4_price_490_test() {

		Cart cart = new Cart();
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook4);

		double price = cart.getPrice();

		assertEquals(490, price, 0);
	}

	@Test
	public void book_3_3_3_3_3_price_500_test() {

		Cart cart = new Cart();
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook3);

		double price = cart.getPrice();

		assertEquals(500, price, 0);

	}

	@Test
	public void book_1_1_2_3_3_4_price_510_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook1);
		cart.add(potterBook2);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook4);

		double price = cart.getPrice();

		assertEquals(510, price, 0);
	}

	@Test
	public void book_1_2_2_3_4_5_price_475_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook2);
		cart.add(potterBook2);
		cart.add(potterBook3);
		cart.add(potterBook4);
		cart.add(potterBook5);

		double price = cart.getPrice();

		assertEquals(475, price, 0);
	}

	@Test
	public void book_1_1_2_2_3_3_4_5_price_640_test() {

		Cart cart = new Cart();
		cart.add(potterBook1);
		cart.add(potterBook1);
		cart.add(potterBook2);
		cart.add(potterBook2);
		cart.add(potterBook3);
		cart.add(potterBook3);
		cart.add(potterBook4);
		cart.add(potterBook5);

		double price = cart.getPrice();

		assertEquals(640, price, 0);

	}

}
