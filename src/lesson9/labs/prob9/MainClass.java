package lesson9.labs.prob9;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book("Test",4);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy -> copy.changeAvailability());
		
		System.out.println(book.isAvailable());
	}

}
