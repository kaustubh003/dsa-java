package foundations;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();

        System.out.println("Dear " + name + ", here is the counting");

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

    }
}
