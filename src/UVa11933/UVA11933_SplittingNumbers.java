package UVa11933;

//UVa no acepta packages ni clases públicas

import java.util.StringTokenizer;
import java.util.Scanner;

class Main {

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);

        long numero = scan.nextInt();
        while (numero != 0) {
            long a = 0;
            long b = 0;
            boolean flag = true;
            for (int i = 0; i < 31; i++) {
                if ((numero & (1 << i)) != 0) {
                    if (flag) {
                        a |= (1 << i);
                    } else {
                        b |= (1 << i);
                    }
                    flag = !flag;
                }
            }
            System.out.println(a + " " + b);
            numero = scan.nextInt();
        }

    }
}
