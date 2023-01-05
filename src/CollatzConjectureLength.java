/**
 * The Collatz Conjecture states that for any positive natural number n, this process:
 *
 * if n is even, divide it by 2
 * if n is odd, multiply it by 3 and add 1
 * repeat
 * will eventually reach n = 1.
 *
 * For example, if n = 20, the resulting sequence will be:
 *
 * [ 20, 10, 5, 16, 8, 4, 2, 1 ]
 * Write a program that will output the length of the Collatz Conjecture for any given n.
 * In the example above, the output would be 8.
 */

public class CollatzConjectureLength {
    public static void main(String[] args) {
        System.out.println("Should return 26: " +conjecture(100L));
    }

    public static long conjecture(long x) {
        int count = 1;

        while(x>1){
            if(x % 2 == 0){
                x = x/2;
            }
            else x = x*3+1;
            count++;
        }
        return count;
    }
}
