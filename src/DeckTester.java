/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks1 = {"king", "4", "ace"};
		String[] suits1 = {"spades", "clubs", "hearts"};
		int[] values1 = {10, 4, 1};
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.toString());

		String[] ranks2 = {"queen", "7", "6"};
		String[] suits2 = {"clubs", "diamonds", "spades"};
		int[] values2 = {10, 7, 6};
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
		System.out.println(deck2.toString());

		String[] ranks3 = {"3", "8", "jack"};
		String[] suits3 = {"diamonds", "hearts", "spades"};
		int[] values3 = {3, 8, 10};
		Deck deck3 = new Deck(ranks3, suits3, values3);
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.size());
		System.out.println(deck3.deal());
		System.out.println(deck3.toString());
	}
}
