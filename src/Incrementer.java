import java.util.Arrays;

/** INSTRUCTION EXAMPLE
 * [1, 2, 3]  -->  [2, 4, 6]   #  [1+1, 2+2, 3+3]
 * [4, 6, 9, 1, 3]  -->  [5, 8, 2, 5, 8]  #  [4+1, 6+2, 9+3, 1+4, 3+5]
 *                                        #  9+3 = 12  -->  2
 */

public class Incrementer {
    public static void main(String[] args) {
        System.out.println("Returning array: " +Arrays.toString(incrementer(new int[]{4, 6, 7, 1, 3})) +"\nCorrect array: [5, 8, 0, 5, 8]");
        System.out.println("incrementer 2: " +incrementer2(4));
        System.out.println("incrementer 3: " + incrementer3(4));
        System.out.println("incrementer 4: " + incrementer4(4));
    }

    private static int incrementer4(final int j) {
        if (j < 1)
            return 1;
        return incrementer4(j-1)*j;
    }


    private static int incrementer3(final int j) {
        int result = 1;
        int value = j;

        for (int i=0; i<j; i++){
            result *= value;
            value--;
        }
        return result;
    }

    private static int incrementer2(final int j) {
        int result = 0;
        int value = j;
        
        for (int i=0; i<j; i++){
            result += value;
            value--;
        }
        return result;
    }

    public static int[] incrementer(int[] numbers) {
        for(int i=0; i<numbers.length; i++){
            numbers[i] = (numbers[i]+i+1)%10;
        }
        return numbers;
    }
    
    
    
}
