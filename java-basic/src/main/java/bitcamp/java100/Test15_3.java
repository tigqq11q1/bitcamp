package bitcamp.java100;

public class Test15_3{
        public static void main(String[] args) {
              byte b1 = 20, b2 = 22;
              short s1 = 30, s2 =33;
              int i1 = 40, i2 = 44;
              long l1 = 50, l2 = 55;
              float f1= 3.14f, f2 = 45.32f;
              double dbl1 = 4567.8988, dbl2 = 9876.5432;

              int r1 = b1 + s1; 
              //int r1 = l1 + i1; 데이터타입 높은 쪽을 따라가야한다 
              long r2 = i1 +  l1;
              r2 = b1 + l1;
              r2 = s2  + l1;

              /*long r3 = b1 + f1; 
              r3 = s1 + f1;                 컴파일 오류  
              r3 = i1 + f1 */

              float r4 = b1 + f1;  //정수타입은 부동소수점을 따라간다 
              r4 = s1 + f1;
              r4 = i1 + f1;
              r4  = l1 + f1; 

              double r5 = f1+ dbl1;
              r5 = dbl1 + dbl2;
              r5 = i2 + f2;
              r5 = b1 + i1;

              //float r6 = f1 + d1;

   

    
      
      
           
     }
      }



