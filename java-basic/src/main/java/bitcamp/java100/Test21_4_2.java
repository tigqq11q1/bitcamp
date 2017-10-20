package bitcamp.java100;

import java.io.Console;

//메서드 적용 
public class Test21_4_2 {
    static Console console;

    static void prepareConsole() {
        Console console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }

    }

    static long inputNomber() {
        return Long.parseLong(console.readLine("숫자?"));
    }

    static int[] countNembers(long value) {
        int[] cnt = new int[10];
        while (value > 0) {
            cnt[(int) (value % 10)]++;
            value /= 10;
        }
        return cnt;

    }

    static void printNemberCount(int[] cnt) {
        int x = 0;
        while (x < cnt.length) {
            System.out.printf("%d = %d 개\n", x, cnt[x]);
            x++;
        }
    }

    public static void main(String[] args) {
        prepareConsole();
        long value = inputNomber();
        int[] cnt = countNembers(value);
        printNemberCount(cnt);
    }
}
