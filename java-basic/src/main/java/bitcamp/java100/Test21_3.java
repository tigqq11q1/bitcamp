package bitcamp.java100;

import java.io.Console;

public class Test21_3 {
    public static void main(String[] args) {

        Console console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        String s1 = console.readLine("문자열");
        System.out.printf("입력한 값:%s\n",s1);
        String[] s2 = s1.split("");
        System.out.print("거꾸로 바꾼 값: ");
        for (int i =s2.length-1; i >= 0; i--) {
            System.out.print(s2[i]);
        } 
          
        
        }
    }


