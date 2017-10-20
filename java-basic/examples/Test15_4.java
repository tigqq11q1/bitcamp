package bitcamp.java100;

public class Test15_4{
        public static void main(String[] args) {
              float f1 = 3.141592f, f2 = 5432.123f;
              int i1 = 7654321;
              System.out.printf("f1=%f, i1=%d\n" ,f1, i1);
              double r1 = f1 +i1; 
              System.out.println(r1);//7654324.0 값이 짤린다  

              r1 = (double) f1 + (double) i1;         //명시적으로 형변환 
              System.out.println(r1);   
           
     }
}



