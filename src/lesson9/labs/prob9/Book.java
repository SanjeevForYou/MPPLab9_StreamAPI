package lesson9.labs.prob9;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;
>>>>>>> e0b37d2c4714f90d6cec5aa105c3871992bb5317

@SuppressWarnings("unused")
public class Book {
	private List<BookCopy> copies = new ArrayList<BookCopy>();
	private String title;
	public Book(String title, int numCopies) {
		if(numCopies < 1) throw new IllegalArgumentException(
				"NumCopies must be positive");
		this.title= title;
		for(int i = 0; i < numCopies; ++i) {
			addCopy();
		}
	}
	public List<BookCopy> getCopies() {
		return copies;
	}
	public void addCopy() {
		BookCopy copy = new BookCopy(this, copies.size() + 1, true);
		copies.add(copy);
	}
<<<<<<< HEAD
=======
	
	public boolean isAvailable()
	{
		boolean value = this.copies.stream()
				.map(x -> x.isAvailable())
				.reduce(false, (a,b) -> a || b);
		return value;
	}
>>>>>>> e0b37d2c4714f90d6cec5aa105c3871992bb5317
}
