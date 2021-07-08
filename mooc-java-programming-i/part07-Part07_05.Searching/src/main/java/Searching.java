
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int i = 0;
        for (Book b : books) {
            if (b.getId() == searchedId) {
                return i;
            }
            
            i++;
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int start = 0;
        int end = books.size() - 1;
        
        while (true) {
            int middle = (end - start) / 2 + start;
            int bookId = books.get(middle).getId();
            
//            System.out.println("(" + start + "," + middle + "," + end + ")");
            
            if (searchedId > bookId) {
                start = middle + 1;
            } else if ( searchedId < bookId) {
                end = middle - 1;
            } else if ( searchedId == bookId) {
                return middle;
            }
            
            if (middle == start || middle == end) {
                break;
            }
            
        }
        
        return -1;
    }
}

