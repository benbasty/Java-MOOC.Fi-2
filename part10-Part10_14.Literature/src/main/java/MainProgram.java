
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String book = scanner.nextLine();
            
            if(book.equals("")){
                System.out.println(books.size() + " books in total.");
                System.out.println("Books:");
                Comparator<Book> comparator = Comparator
                    .comparing(Book::getAge)
                    .thenComparing(Book::getName);
                Collections.sort(books, comparator);
                //for(Book b: books){
                    //System.out.println(b);
                //}
                books.stream()
                    .forEach(Book -> System.out.println(Book));
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(book,age));
            
            
        }
        
        

    }

}
