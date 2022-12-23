public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Not smart fibonacci: " +fib(5));
        System.out.println("Smart fibonacci: " +smarterFib(5));
    }

    public static long fib (int n){
        if (n == 1)
            return n;

        int fibA = 0;
        int fibB = 1;
        int fibC = 0;

        for(int i=1; i<n; i++){
            fibC = fibA + fibB;
            fibA = fibB;
            fibB = fibC;
        }return fibC;
    }

    public static long smarterFib(int f){
        if (f <= 1)
            return f;
        return smarterFib(f-1) + smarterFib(f-2);
    }
}
