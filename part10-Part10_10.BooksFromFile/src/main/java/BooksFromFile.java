
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                .map(row -> row.split(",")) // splits the row on  where the comma is
                .filter(parts -> parts.length >= 4) // ignore if there is less than 4 parts from spliting part
                .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3])) //creates new book
                .forEach(Book -> books.add(Book)); //add book to arraylist and loops
        } catch (IOException ex) {
            System.out.println("Error reading File" + ex.getMessage());
        }
        return books;
    }

}
