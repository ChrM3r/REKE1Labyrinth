package bin;

public class Labyrinth
{
    private char[][] lab;
    private boolean[][] bereitsBesucht;
    private int grenzWertX;
    private int grenzWertY;



    public Labyrinth(char[][] lab) {
        this.lab = lab;
        this.grenzWertX = lab[0].length;
        this.grenzWertY = lab.length;
        this.bereitsBesucht = new boolean[grenzWertX][grenzWertY];
    }

    private boolean istGrenze(int x, int y) {
        return x == 0 || y == 0 || x == grenzWertX - 1 || y == grenzWertY - 1;
    }

    private boolean istAusserhalbDesLabyrinths(int x, int y) {
        return x < 0 || y < 0 || x >= grenzWertX || y >= grenzWertY;
    }

    private boolean istLeer(int x, int y) {
        return lab[x][y] == ' ';
    }

    private boolean istBesetzt(int x, int y) {
        return lab[x][y] == 'X';
    }

    private void besuchtKennzeichenSetzen(int x, int y) {
        if (lab[x][y] == ' ') lab[x][y] = '*';
    }

    private void bereitsBesuchtSetzen(int x, int y) {
        bereitsBesucht[x][y] = true;
    }

    private boolean nochNichtBesucht(int x, int y) {
        return !bereitsBesucht[x][y];
    }

    public boolean existsWeg(int x, int y) {


        if (istAusserhalbDesLabyrinths(x, y)) return false;

        if (istBesetzt(x, y)) return false;

        if (istGrenze(x, y) && istLeer(x, y) && nochNichtBesucht(x, y)) {

            bereitsBesuchtSetzen(x, y);
            besuchtKennzeichenSetzen(x, y);
            return true;

        } else {

            bereitsBesuchtSetzen(x, y);
            besuchtKennzeichenSetzen(x, y);

            if (nochNichtBesucht(x,y-1) && existsWeg(x,y-1)) {

                return true;

            } else if (nochNichtBesucht(x,y+1) && existsWeg(x,y+1)) {

                return true;

            } else if (nochNichtBesucht(x-1,y) && existsWeg(x-1,y)) {

                return true;

            } else if (nochNichtBesucht(x+1,y) && existsWeg(x+1,y)) {

                return true;

            } else {

                return false;
            }
        }
    }


    public static void printLabyrinth(char[][] lab) {
        for (char[] reihe : lab) {
            for (char element : reihe) {
                System.out.print(element);
            }
            System.out.println();
        }
    }


}
