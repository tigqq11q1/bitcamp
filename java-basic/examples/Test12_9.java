package bitcamp.java100;

public class Test12_9 {
        public static void main(String[] args) {
      //문자 코드값을 저장할 변수 선언 
      //자바는 유니코드를 사용하여 문자를 표현하기 때문에 2바이트 메모리가 필요하다 . 0~65535까지 
      char c1 ;
      c1 = 44032;
      char c2 ; 
      c2  =0xAC00;

     char n1,n2,n3;
      n1 = '김';
      n2 = '이';
      n3 = '든';
      System.out.printf("%c %c %c" ,n1, n2, n3);


      char x = '7';
      int num;
      num=x-'0';
      System.out.println(num);
  
     
        }
 }
