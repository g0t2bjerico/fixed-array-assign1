import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		FixedArray bookArr = new FixedArray();
		GenreTag genreArr = new GenreTag();
		BookList listArr = new BookList();

		for(int i = 0; i < 5; i++) {
			System.out.println("Please enter your book title: ");
			
			String userTitle = kbd.nextLine();
			
			System.out.println("Please enter your book's genre: ");
			
			String userGenre = kbd.nextLine();
			
			bookArr.addTitle(userTitle);
			genreArr.addGenre(userGenre);
		}
		
		bookArr.displayTitles();

	}

}
