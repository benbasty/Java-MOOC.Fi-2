
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<Integer> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        
        
        while(true) {
            String row = scanner.nextLine();
            if(row.equals("end")){
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String numbers = scanner.nextLine();
                
                if(numbers.isEmpty()){
                    continue;
                }
                
                if(numbers.equals("n")){
                    double average = inputs.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
                    System.out.println("Average of the negative numbers: " + average);
                } else if(numbers.equals("p")){
                    double average = inputs.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
                    System.out.println("Average of the positive numbers: " + average);
                }
                
                break;
            }
            inputs.add(Integer.valueOf(row));
   
        }

    }
}
