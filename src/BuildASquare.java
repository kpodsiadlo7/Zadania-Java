public class BuildASquare {
    public static void main(String[] args) {

        System.out.println("Returning square: \n" +generateShape(3)
                            +"\nMust be: 3x3");
    }
    public static String generateShape(int n) {
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<n; i++){
            builder.append("+".repeat(n)).append("\n");
        }
        return String.valueOf(builder).stripTrailing();
    }
}
