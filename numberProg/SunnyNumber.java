package numberProg;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sobjr = new Scanner(System.in);
        int n = sobjr.nextInt();
        int x = (int) Math.sqrt(n + 1);
        if ((x * x) == (n + 1)) {
            System.out.println(n + " is a Sunny number.");
        } else {
            System.out.println(n + " is not a Sunny number.");
        }
    }
}
