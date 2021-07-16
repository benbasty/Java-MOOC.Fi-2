
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array){
        //create a string representation of 
        //the array it receives as the parameter and return it.
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                int value = array[i][j];
                numbers.append(value);
            }
            numbers.append("\n");
        }
        return numbers.toString();
    }

}
