package bitcamp.java100.Test17_17.step6;

public class Rect {
    int width;
    int height;
    //인스턴스 메서드 >static 키워드 제거
    //인서턴스 주소 파라미터로 받지 않고 this변수 사용 
    float area() {
        return (this.width * this.height) / 10000f;
    }

    float pyeong() {
        return (this.width * this.height) / 10000f / 3.3f;
    }
}
//타입 이름명 (파라미터){}<=  파라미터 대신 this 사용 