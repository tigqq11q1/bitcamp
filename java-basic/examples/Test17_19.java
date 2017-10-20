package bitcamp.java100;

public class Test17_19 {

    // 인스턴스 메서드 ..특정 클래스의 인스턴스 값을 다루는 전용 메서드
    // static 붙이지 않는다 ..this 사용
    static class My {
        int value;

        void print() {
            System.out.println(this.value);

        }
    }

    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My();

        r1.value = 100;
        r2.value = 200;
        r3.value = 300;

        // 인스턴스 메서드 클래스 이름으로 호출 x
        // My.print(); 컴파일 오류
        r1.print();
        // r1.주소 this 에 저장되 있다

        r2.print();
        r3.print();
        // 인스턴스 주소 앞부분에 ex) r1.
        

    }
}
