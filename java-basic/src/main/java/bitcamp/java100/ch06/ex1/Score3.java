package bitcamp.java100.ch06.ex1;

public class Score3 {
    //필드 = 인스턴스 변수 
    //필드 선언 ...메로리 설계 명령 
//메서드에 선언하는 변수 로컬 변수 .메서드 호출시  스택영역에  생성 
//자바에서 제공하지 않는 타입 정의 => 사용자 정의 타입 (사용자는 개발자)유저 디파인 데이터 타입
    
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //리턴값없다 .초기화 담당
    Score3(){
        System.out.println("Score3()호출됨");
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
        
    }

    //메서드 선언 
    //연산자를 정의
    void compute() {
        this.sum =  this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }  
    
}
