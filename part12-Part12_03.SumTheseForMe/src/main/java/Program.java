
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
        
        

    }
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int sum = 0;
        
        // If the parameter fromWhere is smaller than 0, the lower limit becomes 0 instead
        if(fromWhere < 0){
            fromWhere = 0;
        }
        // if toWhere is larger than the size of the array, the upper limit becomes the last index of the array instead.
        if(toWhere > array.length){
            toWhere = array.length;
        }
        
        // lets calculate the sum of the elements in the array between the lower and the upper limits.
        // Only numbers smaller or equal to the int largest and larger or equal to the int smallest are added to the sum.
        
        while(fromWhere < toWhere) {
            if(array[fromWhere] <= largest && array[fromWhere] >= smallest){
                sum += array[fromWhere];
            }
            fromWhere++;
        }
        return sum;
      
    }

}
