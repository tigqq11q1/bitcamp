package bitcamp.java100;

public class Test12_6 {
        public static void main(String[] args) {
 
byte b1 = 50; 
byte b2 =50;
byte b3;


b3 =100; //성공 

//b3 =b1+b2;  실패 

b3 =50+50; //리터럴과 리터럴의 연산 결과는 리터럴이다 .성공 

//b3 = b1 +50; 
 
//컴파일 오류 
//short s1;
//s1 = b1 + b2 ;
        //결론 : 자바 프로그래밍 할 때 작은 정수 값을 다룰 때도 그냥 4바이트 
        //          int 메모리를 사용하라 
       //->파일의 바이너리 데이터를 다룰 때만byte 메모리를 사용한다 . 
        }
 }
