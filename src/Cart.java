import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Cart {

	private ArrayList<PotterBook> bookList;

	Cart(ArrayList<PotterBook> bookList) {
		this.bookList = bookList;

	}

	public double getPrice() {

		if (bookList == null) {
			return 0;
		}

		if (isAllDifferent(bookList)) {

			switch (bookList.size()) {
			case 0:
				return getTotalPrice(bookList);
			case 1:
				return getTotalPrice(bookList) * 1;
			case 2:
				return getTotalPrice(bookList) * 0.95;
			case 3:
				return getTotalPrice(bookList) * 0.90;
			case 4:
				return getTotalPrice(bookList) * 0.80;
			case 5:
				return getTotalPrice(bookList) * 0.75;
			}

			return 0;
		} else {
			int[] countArray = getCountArray(bookList);
			ArrayList<int[]> subsetList = getSubsetList(countArray);

			double minPrice = Double.MAX_VALUE;
			for (int[] subset : subsetList) {
				int[] differenceSet = getDifferenceSet(countArray, subset);
				if (!isAllZero(subset) && !isAllZero(differenceSet)) {


					Cart cart1 = new Cart(setToBookList(subset));
					Cart cart2 = new Cart(setToBookList(differenceSet));
					double price = cart1.getPrice() + cart2.getPrice();

					if (price < minPrice) {
						minPrice = price;
					}
				}
			}
			return minPrice;
		}

	}

	private boolean isAllDifferent(ArrayList<PotterBook> bookList) {
		Set<PotterBook> set = new HashSet<>(bookList);
		if (set.size() == bookList.size()) {
			return true;
		}
		return false;
	}

	private boolean isAllZero(int[] set) {
		for (int num : set) {
			if (num != 0) {
				return false;
			}
		}
		return true;
	}

	private int[] getCountArray(ArrayList<PotterBook> bookList) {

		int[] countArray = new int[5];
		for (PotterBook book : bookList) {
			switch (book.getEpisode()) {
			case 1:
				countArray[0]++;
				break;
			case 2:
				countArray[1]++;
				break;
			case 3:
				countArray[2]++;
				break;
			case 4:
				countArray[3]++;
				break;
			case 5:
				countArray[4]++;
				break;
			}
		}
		return countArray;
	}

	private int[] getDifferenceSet(int[] setA, int[] setB) {

		int[] differenceSet = new int[5];
		for (int i = 0; i < 5; i++) {
			differenceSet[i] = Math.abs(setA[i] - setB[i]);
		}

		return differenceSet;
	}

	private double getTotalPrice(ArrayList<PotterBook> bookList) {
		double price = 0;
		for (PotterBook book : bookList) {
			price += book.getPrice();
		}
		return price;
	}

	private ArrayList<int[]> getSubsetList(int[] countArray) {
		ArrayList<int[]> subsetList = new ArrayList<int[]>();

		if (isAllZero(countArray)) {
			int[] allZeroSet = { 0, 0, 0, 0, 0 };
			subsetList.add(allZeroSet);
		} else {
			for (int i = 0; i < 5; i++) {
				if (countArray[i] > 0) {
					for (int count = 0; count <= countArray[i]; count++) {
						int[] countArrayCopy = countArray.clone();
						countArrayCopy[i] = 0;
						for (int[] tempArray : getSubsetList(countArrayCopy)) {
							int[] tempArrayCopy = tempArray.clone();
							tempArrayCopy[i] = count;
							subsetList.add(tempArrayCopy);
						}
					}
					break;
				}
			}
		}
		return subsetList;
	}

	private ArrayList<PotterBook> setToBookList(int[] countArray) {
		ArrayList<PotterBook> bookList = new ArrayList<PotterBook>();
		PotterBook potterBook1 = new PotterBook(1, 100);
		PotterBook potterBook2 = new PotterBook(2, 100);
		PotterBook potterBook3 = new PotterBook(3, 100);
		PotterBook potterBook4 = new PotterBook(4, 100);
		PotterBook potterBook5 = new PotterBook(5, 100);
		for (int i = 0; i < 5; i++) {
			for (int count = 0; count < countArray[i]; count++) {
				switch (i) {
				case 0:
					bookList.add(potterBook1);
					break;
				case 1:
					bookList.add(potterBook2);
					break;
				case 2:
					bookList.add(potterBook3);
					break;
				case 3:
					bookList.add(potterBook4);
					break;
				case 4:
					bookList.add(potterBook5);
					break;
				}
			}
		}
		return bookList;
	}
}
