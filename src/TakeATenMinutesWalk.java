public class TakeATenMinutesWalk {
    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }

    public static boolean isValid(char[] walk) {

        int north = 0;
        int east = 0;
        int west = 0;
        int south = 0;

        for (char c : walk) {
            if (c == 'n')
                north++;
            if (c == 'e')
                east++;
            if (c == 'w')
                west++;
            if (c == 's')
                south++;
        }
        return walk.length == 10 && north == south && west == east;
    }
}
