package numberProg;

import java.util.Scanner;

public class PronicNumber {

    public static void main(String[] args) {
        Scanner sobjr = new Scanner(System.in);
        int num = sobjr.nextInt();
        sobjr.close();
        boolean flag = false;
        for (int n = 0; n <= num; n++) {
            if (n * (n + 1) == num) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(num + " is a Pronic number.");
        } else {
            System.out.println(num + " is not a Pronic number.");
        }
    }
}
