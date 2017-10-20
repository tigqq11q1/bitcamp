package bitcamp.java100;

public class Test17_3{
        
    static void m1(String name) {//name 변수가 "파라미터"
        System.out.printf("%s님 반갑습니다\n", name);
    }
    static void m2(String name, int age) {//name 변수가 "파라미터"
        System.out.printf("%s(%d)님 반갑습니다\n", name, age);
    }
  
       public static void main(String[] args) {
           //메서드 호출할 때 파라미터에 넘기는 값을 "아규먼트"
           m1("홍길동");
           m1("임꺽정");
           m1("유관순");
           
           m2("홍길동",20);
           m2("임꺽정",30);
           m2("유관순",16);
        }
}

 
