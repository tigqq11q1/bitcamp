package bitcamp.java100;

public class Test18_2 {
    // 리터럴 사용하여 암시적으로 string 인스턴스를 생성하는 방법을 알아보자
    public static void main(String[] args) {
        String s1; // 리터럴 = 그냥 코드로 바로 적는 값
        s1 = "ABC가각간";// 이건 문자열 리터럴
        // S1.레퍼런스이기에 값이 직접 저장되는 것이 아니라 그 주소가 저장되는 것이다
        // 문자열 리터럴을 string 레퍼런스에 대입하면 자바는 자동으로 new string()명령으로 바꾼다

        String s2 = "ABC가각간"; //상수풀 에 만들어진다 메모리를 효율적으로 사용하기 위해서 

        // String s2 =("ABC가각간");
        if (s1 == s2) //주소가 같다 
            System.out.println("s1 == s2");
       

    }
}
