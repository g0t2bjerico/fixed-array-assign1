/*
 * This class allows the user to add, display and search up to 5 book titles in an array
 * 
 * 
 * @author Braden Pottle
 */
public class FixedArray {
	
	private String[] bookTitles = new String[5];
	private int count = 0;
	
	public void addTitle(String title) {
		
		if(count < bookTitles.length) {
			bookTitles[count] = title;
			count++;
		}
	}
	
	public void displayTitles() {
		for(int i = 0; i < bookTitles.length; i++) {
			System.out.println("Book " + (i + 1) + " title: " + bookTitles[i]);
		}
	}
	
	public void searchTitle(String title) {
		for(int i = 0; i < bookTitles.length; i++) {
			if(bookTitles[i].equalsIgnoreCase(title)) {
				System.out.println("Book found at: " + bookTitles[i]);
				return;
			}
		}
	}
	/* 
	 * Arrays are great to use for AI training when you want to optimize speed and already know 
	 * how many elements the AI will be trained on. Howevever, it comes with the limitation of 
	 * limited flexibility.
	 * 
	 * ArrayLists on the other hand allow you to train an AI with an almost limitless amount of
	 * data with only the downside of slower access and less optimized performance. This is most
	 * useful when working with data from an outside source with an unknown amount of elements.
	 */
}
