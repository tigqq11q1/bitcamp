package bitcamp.java100.ch06.ex1;

public class Test4 {
   
    public static void main(String[] args) {
        //변수 준비
    Score3 score;
    // 인스턴스 만들 때 생성자 호출 
    score = new Score3();
        System.out.printf("이름 = %s\n",score.name);
        System.out.printf("총점 = %d\n",score.sum);
        System.out.printf("평균 = %f\n",score.aver);
        
        
     
        //score = new Score3("홍길동");Score3에는 문자열을 받는 생성자가 없기 때문에 
        

}
}