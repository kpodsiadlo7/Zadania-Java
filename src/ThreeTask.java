

public class ThreeTask {
    public static void main(String[] args) {
        System.out.println(stringChallenge("aabbcde"));
        System.out.println("should return 5: " +arrayChallenge(new int[] {10,12,4,5,9}));
    }

    public static String stringChallenge(String str) {

        int count = 0;
        char letter;
        StringBuilder result = new StringBuilder();

        for (int i=0; i<str.length()-1; i++){
            letter = str.charAt(i);
            count++;
            if (letter != str.charAt(i+1)){
                result.append(count).append(letter);
                count = 0;
            }
        }
        result.append(1).append(str.charAt(str.length()-1));
        return result.toString();
    }

    public static String stringChallengeTime(String str) {
        //TODO
        return "";
    }

    public static int arrayChallenge(int[] arr) {
        int whereIsMin = 0;
        int min = arr[0];


        for (int i=0; i<arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
                whereIsMin = i;
            }
        }
        int max = arr[min];
        for (int i=whereIsMin; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max - min;
    }
}
