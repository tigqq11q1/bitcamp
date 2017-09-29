package bitcamp.java100;

public class Test12_7 {
        public static void main(String[] args) {
                //부동소수점을 변수에 저장하는 방법 
                //단정도 (32비트,single,float type)저장할 메모리 준비 
                float f1;
                f1 = 9876567f;
                System.out.println(f1);

                f1=9876543456789L;//8바이트 정수 4바이트 메모리에 저장; 오류는 뜨지 않지만 값이 짤려 나온다 . 
                System.out.println(f1);
                
                //f1 = 9876543.4567;//컴파일 오류 

                //f1 = 9876543.4567F; 컴파일은 되지만 실행시 값이 짤린다 
               // System.out.println(f1); 

               //정수 값을 부동소수점 메모리에 저장 하지 말라
               //부동소수점 자체가 근사값을 나타내기 때문에 
               //정수값의 정확한 값을 나타낼 수 없다 .
                

        }
 }
