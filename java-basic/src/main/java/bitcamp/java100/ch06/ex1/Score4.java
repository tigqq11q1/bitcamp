package bitcamp.java100.ch06.ex1;

public class Score4 {
    
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //리턴값없다 .초기화 담당
                       //파라미터 값을 선언 
    Score4(String name,int kor, int eng, int math){
        
        System.out.println("Score4()호출됨");
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
        
    }

    //메서드 선언 
    //연산자를 정의
    void compute() {
        this.sum =  this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }  
    
}
