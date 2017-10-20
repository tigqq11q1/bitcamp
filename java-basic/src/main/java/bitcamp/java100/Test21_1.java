package bitcamp.java100;

import java.util.Scanner;

public class Test21_1 {

    public static void main(String[] args) throws Exception {

        // 1)Scanner객체 생성 
        Scanner keyScan = new Scanner(System.in);
        // 2)키보드로부터 들어온 데이터 읽는다
        System.out.print("입력하세요 ");
        //next line : 입력된 내용 한 줄씩 잘라 리턴 
        String line = keyScan.nextLine();
        System.out.println(line);
        // 3)사용 종료 후 그 객체가 사용한 자원을 해제시킨다 
        keyScan.close();

    }
}