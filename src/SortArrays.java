import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        sortArray(new int[] {1,2,3});
        sortArray(new double[] {1.00,7.00,3.00});
        sortArray(new float[] {14.0f,22.0f,3.0f});
        sortArray(new long[] {31213214414444L,2,3});
    }
    public static int[] sortArray(int[] array){
        Arrays.sort(array);
        return array;
    }
    public static double[] sortArray(double[] array){
        Arrays.sort(array);
        return array;
    }
    public static float[] sortArray(float[] array){
        Arrays.sort(array);
        return array;
    }
    public static long[] sortArray(long[] array){
        Arrays.sort(array);
        return array;
    }
    public static Object[] sortArray(Object[] array){
        Arrays.sort(array);
        return array;
    }
}
