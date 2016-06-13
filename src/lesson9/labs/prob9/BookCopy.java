package lesson9.labs.prob9;

@SuppressWarnings("unused")
public class BookCopy {
	private Book book;
	private int copyNum;
	private boolean isAvailable;
	public BookCopy(Book book, int copyNum, boolean isAvailable) {
		this.book = book;
		this.copyNum = copyNum;
		this.isAvailable = isAvailable;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void changeAvailability() {
		isAvailable = !isAvailable;
	}
<<<<<<< HEAD
=======
	
	
>>>>>>> e0b37d2c4714f90d6cec5aa105c3871992bb5317
}
