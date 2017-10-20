package bitcamp.java100.Test17_17.step6;

import bitcamp.java100.Test17_17.Test17_16_C;

public class Test {

    public static void main(String[] args) {
        Rect r;
        r = new Rect();

        r.width = 390;
        r.height = 420;

       //인스턴스 전용 메서드 호출시
        //파라미터가 아닌 메서드 앞에 인스턴스 주소를 지정 
        //인스턴스주소 .메서드명();
        System.out.println(r.area());

        System.out.println(r.pyeong());
        //r값은 번지수 ...r에서장된 번지수는 RECT의 this에 저장되 있다 

    }
}
