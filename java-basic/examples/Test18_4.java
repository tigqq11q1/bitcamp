package bitcamp.java100;

public class Test18_4 {
    // string 인스턴스 의 내용 비교
    // equals() 사용 하여 string 인스턴스의 내용물을 비교해 보자
    public static void main(String[] args) {
        // 상수풀에 생성
        String s1 = "ABC가각간";
        String s2 = new String("ABC가각간");
        if (s1 != s2)
            System.out.println("s1 != s2");// 레퍼런스 주소 비교 즉 인스턴스가 같은지 비교 결과 다르다 ...

        if (s1.equals(s2))
            System.out.println("1과 s2의 내용믈이 같다");// 내용물이 같은지 비교

    }
}
