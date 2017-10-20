package bitcamp.java100;

public class Test16_4{
        public static void main(String[] args) {
         
           int i = 0; 
           while (i < 5)
               //System.out.println(i);무한루프
               //System.out.println(++i);//1~5까지 증가하고 종료 
               System.out.println(i++);//0~4 
               
           System.out.println("---------------------------");
           
           i = 0;
           while (i < 5) {
               System.out.print("=>" );
               System.out.println(i);
               i++;
           }
           
           System.out.println("---------------------------");
           
           i = 1; 
           while (i <= 5) {
               int count = 1;
               while (count <= i) {
                   System.out.print("*");
                   count++;
               }
               System.out.println();
               i++;
             
           }
           System.out.println("---------------------------");
             
           i = 5; 
           while (i > 0) {
               int count = 1;
               while (count <= i) {
                   System.out.print("*");
                   count++;
               }
               System.out.println();
               i--;
           }      
           
           System.out.println("---------------------------");
           
           i = 1; 
           while (i <= 5) {
               int count = 5 -i;
               while (count > 0) {
                   System.out.print(" ");
                   count--;
               }
               count = 1;
               while (count <= i ) { 
                   System.out.print("*");
                   count++;
               }
               System.out.println();
               i++;
           }
           
           System.out.println("---------------------------");
           
           i = 1; 
           while (i <= 5) {
               int count = (5 -i) / 2;
               while (count > 0) {
                   System.out.print(" ");
                   count--;
               }
               count = 1;
               while (count <= i ) { 
                   System.out.print("*");
                   count++;
               }
               System.out.println();
               i +=2;
               
               
           }
           
           
           System.out.println("---------------------------");
           
           i = 5; 
           while (i > 0) {
               int count = (5 -i) / 2;
               while (count > 0) {
                   System.out.print(" ");
                   count--;
               }
               count = 1;
               while (count <= i ) { 
                   System.out.print("*");
                   count++;
               }
               System.out.println();
               i -=2;
               }
           
           System.out.println("---------------------------");
           
           i = 0;
           while (i < 5) {
               if (i == 3) {
                   break;//0,1,2;
               }
               System.out.println(i);
               i++;
           } 
           
           System.out.println("---------------------------");
           
           i = 0;
           while (i < 5) {
               if (i == 3) {
                   i++;
                   continue;//바로 조건 검사로 이동  결과 0,1,2,4;
               }
               System.out.println(i);
               i++;
           } 
           
           System.out.println("---------------------------");
           //중첩 반복문 빠져 나가기
           i = 1;
           label1: {
           while (i <= 10) {
               int count = 1;
               while (count <= i) {
                   System.out.print("*");
                   if (count ==5) {
                      // break;//현재 반복문을 탈출
                       break label1;
                   }
                   count++;
               }
                   System.out.println();
               i++;
           } 
           System.out.println();
           System.out.println("---------------------------");
           }
         

           System.out.println("---------------------------");
           //2단에서 9단까지 
          int q = 2;
          int j;
          int mul = 0;
          
          while (q < 10) {//2분터 9까지 반복 
              j = 1;
              while (j< 10) {//1부터 9까지 반복 
                  mul = q * j; 
                          System.out.println(q + "*" +j+ "=" + mul);
                  j++;
              }
                  q++;
              }
          System.out.println("---------------------------");
          int w = 2;
          while (w <= 9) {
              int z =1;
              while (z <= 9) {
              System.out.printf("%d * %d = %d\n",w,z,(w*z));
              z++;
          }
              w++;
          }
          
          System.out.println("---------------------------");
          
        /* i =987654321;
          while (i > 0) {
              System.out.printf("%d ",i %10);
             i /= 10;
          } */
          
          System.out.println("---------------------------");
          
          i = 4885323;
          int[] cnt = new int [10];
         
          while (i > 0) {
              cnt[i % 10]++;
              i /= 10;
          }
          
          int x = 0;
          while (x <cnt.length) {
              System.out.printf("%d = %d\n", x ,cnt[x]);
              x++;
               }
              
              
              
 
              
         
          
        }         
}

