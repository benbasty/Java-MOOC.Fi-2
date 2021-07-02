
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        double average = 0;
        double sum = 0;
        double numberCount = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0){
                break;
            } else if(input > 0){
                numberCount++;
                sum += input;
                average = sum/numberCount;   
            }
        }
        if(numberCount == 0){
            System.out.println("Cannot calculate the average");       
        } else {
            average = sum/numberCount;
            System.out.println(average);
        }       
    }
}
