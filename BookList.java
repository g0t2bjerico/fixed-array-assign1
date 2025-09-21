import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        label:
        while (true) {
            System.out.println("\n----- Book List Menu -----");
            System.out.println("1) Add book");
            System.out.println("2) Remove book");
            System.out.println("3) Show all books");
            System.out.println("4) Search");
            System.out.println("5) Exit");
            System.out.print("Please enter selection: ");

            String choice = kbd.nextLine();

            switch (choice) {
                case "1": {
                    System.out.println("-- Add book --");
                    System.out.println("Enter title: ");
                    String title = kbd.nextLine();
                    books.add(title);
                    System.out.println("Added: " + title);
                    break;
                }
                case "2": {
                    System.out.println("-- Remove Book --");
                    System.out.println("Enter title to remove: ");
                    String title = kbd.nextLine();
                    if (books.remove(title)) {
                        System.out.println("Removed: " + title);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                }
                case "3":
                    System.out.println("-- Book List --");
                    if (books.isEmpty()) {
                        System.out.println("No books yet.");
                    } else {
                        System.out.println("Books:");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ") " + books.get(i));
                        }
                    }
                    break;
                case "4": {
                    System.out.println("-- Book Title Search --");
                    System.out.println("Enter book title: ");
                    String title = kbd.nextLine();
                    if (books.contains(title)) {
                        System.out.println("Found: " + title);
                    } else {
                        System.out.println("Not Found.");
                    }
                    break;
                }
                case "5":
                    System.out.println("Goodbye!");
                    break label;
                default:
                    System.out.println("Please pick 1-5.");
                    break;
            }
        }
        kbd.close();
    }
}
