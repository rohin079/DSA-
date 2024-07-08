package Strings;

public class GetShortestPath {
    public static float shortestPath(String str) {

        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {

            char dir = str.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return (float) (Math.sqrt(x2 + y2));
    }

    public static void main(String[] args) {
        String str = "WWNSEWNNEWS";

        System.out.println(shortestPath(str));

    }

}
