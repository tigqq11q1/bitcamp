package bitcamp.java100;

import java.io.Console;

public class Test21_2 {
    public static void main(String[] args) {

        Console console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        while (true) {
            int gugu = Integer.parseInt(console.readLine("구구단? "));

            if (2 <= gugu && gugu <= 9) {
                for (int a = gugu, b = 1; b <= 9; b++)
                    System.out.printf("%d x %d = %d\n", a, b, a * b);
                continue;
            } else if (gugu == 10) {
                System.out.println("2단에서 9단까지만 가능합니다");
                continue;

            } else if (gugu == 1) {
                System.out.println("2단에서 9단까지만 가능합니다");
                continue;
            } else if (gugu == 0) {
                System.out.println("다음에 또 만나요");
                break;
            }

        }
    }

}
