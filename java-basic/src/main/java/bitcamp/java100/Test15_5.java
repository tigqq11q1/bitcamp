package bitcamp.java100;

public class Test15_5{
        public static void main(String[] args) {
              int a = 10;
              int b = 10;

              a = a + 1;
              b = b - 1;

              System.out.printf ("a=%d, b=%d\n", a , b);

              a = 10;
              ++a;
              b = 10; 
              --b;
              System.out.printf("a=%d, b=%d\n ",a, b);

              
              a = 10;
              a++;
              b = 10; 
              b--;
              System.out.printf("a=%d, b=%d\n ",a, b);

              int r1 = ++a;
              int r2 = --b;
              System.out.printf("a=%d, b=%d, r1=%d, r2%d\n ",a, b, r1, r2);

              a = 10;
              a = ++a;  
              System.out.println(a); //11
              b = 10; 
              b = b++;
              System.out.println(b); //10 

              a = 5;
              r1 = ++a + ++a * ++a;
              System.out.printf("a=%d r1=%d\n",a, r1);

              
              a = 5;
              r1 = a++ + a++ * a++;
              System.out.printf("a=%d r1=%d\n",a, r1);

           
     }
}



