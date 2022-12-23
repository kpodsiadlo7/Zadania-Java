public class VowelCount {
    public static void main(String[] args) {
        System.out.println("Returning value: " +getCount("abracadabra") +
                            "\nShould be: 5");
        System.out.println("Returning value: " +getCount("aaertgiionngpouu") +
                "\nShould be: 9");

    }
    public static int getCount(String str) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for (int j=0; j<str.length(); j++){
            if (str.charAt(j) == 'a')
                a++;
            if (str.charAt(j) == 'e')
                e++;
            if (str.charAt(j) == 'i')
                i++;
            if (str.charAt(j) == 'o')
                o++;
            if (str.charAt(j) == 'u')
                u++;
            }
        return a+e+i+o+u;
    }
}

