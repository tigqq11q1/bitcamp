package bitcamp.java100;

public class Test1_1_2{
        public static void main(String[] args) {
            
           for(int i = 0; i <= 5; i++) {
              // for(int j = 0; j <= i; j++) {
                   System.out.print("*");
             //   }
                System.out.println();
           }     
           
                System.out.println("---------------------------");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < (5+i); j++) {                       
                      System.out.print((j < (4 - i)) ? " " : "*"); 
                 }
                    System.out.println();
            }

                System.out.println("---------------------------");
                for (int i = 0; i < 5; i++) {
                    for (int j = i; j < 5; j++) {
                            System.out.print("*");
                    }
                    System.out.println();
            }
                System.out.println("---------------------------");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < (9 - i); j++) {   
                      System.out.print((j < i) ? " " : "*");     
                    }
                    System.out.println();
            }
                System.out.println("---------------------------");
         
               


        }

        
}
            
              
 

