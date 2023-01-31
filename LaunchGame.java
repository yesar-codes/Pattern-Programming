import java.util.Scanner;
public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.getNumberfromPlayers();
        umpire.getResult();
    }
}
class Umpire {
    int guesserNum;
    int p1num;
    int p2num;
    int p3num;
    public void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        guesserNum = guesser.getNum();
    }
    public void getNumberfromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        p1num = p1.getNum();
        p2num = p2.getNum();
        p3num = p3.getNum();
    }
    public void getResult() {
        if(guesserNum==p1num) {
            System.out.println("p1 win");
        }
            if(guesserNum==p2num) {
                System.out.println("p2 win");
            }
            if(guesserNum==p3num) {
                System.out.println("p3 win");
            }
            if(guesserNum!=p1num&&guesserNum!=p2num&&guesserNum!=p3num) {
                System.out.println("LOSER");
            }
        }
    }
class Guesser {
    public int getNum() {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }
}
class Player {
    public int getNum() {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }
}