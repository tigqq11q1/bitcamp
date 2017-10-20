package bitcamp.java100.ch06.ex1;

public class Test2 {
    public static void main(String[] args) {
        
      Score score = new Score(); //메모리 준비  메모리를 객체 또는 인스턴스  
      //Score score; 주소를 레퍼런스 
      //score = new Score(); 뉴연산자 통한 메모리 힙 에 .가비지 컬렉터에 의해 제거될때까지 
      
        score. name = "홍길동";
        score.kor = 100;
        score.eng = 100; 
        score.math = 100;
        
        score. sum = score.kor +score.eng + score.math;
        score.aver = score.sum / 3f;
}
}
