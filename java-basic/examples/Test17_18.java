package bitcamp.java100;

public class Test17_18 {

    //클래스에 소속된 메서드 > 클래스 메소드  = static 붙은 메서드 = static 메서드
    //인스턴스 값 사용하려면 파라미터로 받아야함
    
    static class My {
        int value;
        static void print(My ref) {
        System.out.println(ref.value );
        }
    }
    
    public static void main(String[] args) {
             My r1 = new My();
             My r2 = new My();
             My r3 = new My();
             
             r1.value = 100;
             r2.value = 200;
             r3.value = 300;
        
             My.print(r1);
             My.print(r2);
             My.print(r3);
             //클래스 메서드 호출시 클래스 이름대신 레퍼런스로 호출 가능
             //하지만 클래스 이름으로 호출하는 것이 소스 코드를 해석하기 쉽다 
             r1.print(r1);
             //
    }
}
