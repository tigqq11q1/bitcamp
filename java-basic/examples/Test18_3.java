package bitcamp.java100;

public class Test18_3 {
    // string 인스턴스 암시적 생성과 명시적 생성
    public static void main(String[] args) {
        // 상수풀에 생성
        String s1 = "ABC가각간";
        String s2 = "ABC가각간";
        String s3 = "ABC가각간";
        // 힙에 생성
        String s4 = new String("ABC가각간");
        String s5 = new String("ABC가각간");
        String s6 = new String("ABC가각간");

        if (s1 == s2)
            System.out.println("s1 == s2");
        if (s1 == s3)
            System.out.println("s1 == s3");

        if (s1 != s4)
            System.out.println("s1 != s4");
        if (s1 != s5)
            System.out.println("s1 != s5");
        if (s1 != s6)
            System.out.println("s1 != s6");
        
        if (s4 != s5)
            System.out.println("s1 != s4");
        if (s4 != s6)
            System.out.println("s1 != s5");
        if (s5 != s6)
            System.out.println("s1 != s6");

    }
}
/*
 * main호출되어 스택영역에 args 시작으로 s1~s6생성된다
 *  힙영역에는 new 연산자 사용된 s4~s6가 생성된다, 주소가 다 다르다
 * 암시적 으로 생성된것은 상수 풀에 생성 된다 주소가 저장되는 것이다 s1~s3 는 주소가 같다
 */