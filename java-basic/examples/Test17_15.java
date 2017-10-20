package bitcamp.java100;

public class Test17_15{
    //로컬 변수 생명주기 , 객체의 생명주기
    
        static int m1() {
         int a = 100;
         int b = 200;
         int c = a + b;
         return c; //로컬변수 c 의 값을 리턴한다 . 
         
      }
        
        static int[] m2() {
            int[] arr = new int[3];//new 연산자 사용하여 만든 배열은 힙영역에 생성된다 
            //메서드 호출 끝나도 유지된다 ,사라지지 않는다 //int[],int 배열의 주소 
            arr[0] = 100;
            arr[1] = 200;
            arr[2] = 300;
            return arr;//배열의 주소를 리턴 
            //arr 는 로컬변수 호출 끝나면 제거됨 
            //arr 주소를 저장하는 로컬변수 
         }
        
      public static void main(String[]args) { 
      int r1 = m1();
      //m1()에서 만든 로컬 변수는 접근할 수 없다
      //a = 300; 
      //b = 300;
      //c = 300;
      
      //m1()의 로컬 변수 c의 값은 r1 변수에 리턴 받앗기 때문에 사용 가능 
      System.out.println(r1);
      
      System.out.println("----------------");
      
     int[] r2 = m2();
     
     
     for (int i : r2) {
         System.out.println(i);
     }
      }
} 


       
     
    
     

  
 
