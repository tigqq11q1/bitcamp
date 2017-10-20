package bitcamp.java100;

import java.io.File;

public class Test20_3 {

    static void print1(String value) {
        System.out.println(value);
    }

    static void print2(int value) {
        System.out.println(value);
    }

    static void print3(float value) {
        System.out.println(value);
    }
//object의 레퍼런스는 자바의 모든 (클래스의/타입의)객체(주소)를 저장할 수 있다.
    static void print4(Object value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        // 레퍼 클래스 사용전 기본값 받는 메서드 별도로 만들어 줘야함
        print1("문자열");
        print2(300);
        print3(3.14f);
        //다양한 타입의 객체 전달하기 d
        String v1 = "홍길동";
        StringBuffer v2 = new StringBuffer("임꺽정");
        File v3 = new File(".");
        
        print1(v1);
       // print1(v2);
        //print1(v3);
        print4(v1);
        print4(v2);
        print4(v3);
        
        //1)원래는 객체 주소를 줘야하는데 
        print4(new Integer(100));
        print4(new Float(3.14f));
        print4(new Boolean(true));        
       // 2)컴파일러가 오토박싱으로 인해 자동으로 객체가 생성되기에 가능
        print4(100);
        print4(3.14f);
        print4(true);
        //값을 객체로 객체를 값으로 ......자동으로 ..
       
    }
}