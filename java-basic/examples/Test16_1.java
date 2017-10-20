package bitcamp.java100;

public class Test16_1{
        public static void main(String[] args) {
            
           int a = 100;
           {
               System.out.println(a);
               // int a = 200;
             //컴파일 오류 블럭 내부와 블럭 외부에 같은 이름의 변수를 선언시 컴파일 오류가 일어난다.
               int b = 200;
               System.out.println(b);
               
               {int c = 300;
               System.out.println(c);
               }
           }
           //System.out.println(b);    블럭을 벗어난 변수는 사용 할 수 없다, 블럭을 벗어나는 순간 제거된다  
           
           //System.out.println(c);
           
           System.out.println(a);
           int b =400;
           System.out.println(b); //제거되었기에 새로 변수선언이 가능하다 
        }
      }



