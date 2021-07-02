
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int inputToInt = Integer.valueOf(input);
            System.out.println(inputToInt * inputToInt * inputToInt);
            
        }
        

    }
}
