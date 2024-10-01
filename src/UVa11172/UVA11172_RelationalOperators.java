package UVa11172;

//UVa no acepta packages ni clases públicas

import java.util.Scanner;

class Main {

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);


        int numVeces = scan.nextInt();

        for (int i=1; i<=numVeces; i++) {

            long X = scan.nextLong();
            long Y = scan.nextLong();

            if (X > Y) {
                System.out.println(">");
            } else if (X < Y) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }
}
