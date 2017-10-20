package bitcamp.java100;

public class Test16_6{
        public static void main(String[] args) {
      
            // for문  //1번
            for (int i = 0; i < 5; i++)
                System.out.println(i);
            System.out.println("---------------------------");
 
              for(int i = 0,j = 0; i < 5; i++,j += 2)
                  System.out.printf("%d %d\n",i ,j);
         
              System.out.println("---------------------------");
              //2번
              int sum = 0;
              for (int i = 0; i < 10; i++)
                  sum += i;
              System.out.println(sum);
              //System.out.println(i);    
              
              System.out.println("---------------------------");
              //3번
              for (int i=0; i <= 10; i++) {
                  System.out.printf("=>");
                  System.out.println(i);
              }
              
              System.out.println("---------------------------");
              //4번
              for(int i = 0; i < 10 ; i++) {
                  if (i ==5)
                      break;
                  System.out.println(i);
              }
              System.out.println("---------------------------");
              //5번 
              for(int i = 0; i < 10 ; i++) {
                  if (i ==5)
                      continue;
                  System.out.println(i);
              }
              System.out.println("---------------------------");
              //6번 
              int i = 0; 
              for (; i < 5; i++)
                  System.out.println(i);
                  System.out.println(i);
                  
              System.out.println("---------------------------");
              //7번
              i = 0; 
              for (; i < 5;) {
                  System.out.println(i);
                  i++;
              }
              
              System.out.println("---------------------------");
              //8번 
              i = 0; 
              for (;;) {
                  System.out.println(i);
                  i++;
                  if ( i == 5)
                      break;
              }
              
              System.out.println("---------------------------");
              //9번 
              //포문은 배열다룰때 주로 사용한다 
              String[] names = {"홍길동","임꺽정","유관순","안중근","윤봉길"};
              for (int index = 0; index < names.length; index++) {
                  System.out.println(names[index]);
              }
              
              System.out.println("---------------------------");
              //10 별그리기 
              for (int a = 1; a <= 5 ; a++) {
                  for (int b = 0; b < a; b++) {
                      System.out.print("*");
                  }
                  System.out.println();
              }
              
              System.out.println("---------------------------");
              //11번 별 
              label1:
              for (int a = 1; a <= 5 ; a++) {
                  for (int b = 0; b < a; b++) {
                      System.out.print("*");
                      if ( b == 2)
                          break label1;

                  }
                  System.out.println();
              }
              System.out.println();
              
              System.out.println("---------------------------");
              // 구구단 
              
             /* int q = 2;
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
                  }   */
              
              for(int q = 2; q <= 9; q++) {
                  for(int j = 1; j <= 9; j++) {
                      System.out.printf("%d x %d = %d\n",q ,j ,q*j);
                   }           
               }      
                 
              System.out.println("---------------------------");
              // 숫자 거꾸로 출력 
              int v = 98761234;
              
              for(; v > 0; v /= 10) {
                  System.out.printf("%d", v % 10);
              }
              System.out.println();
              
             
                  
               
              
        }
}
             /* for(int i = 0; i < 5; i++) {
                  for(int j = 0; j <= i; j++) {
                      System.out.printf("*");
                  }
                  System.out.println();
              }
              System.out.println("---------------------------");
              for(int i = 0; i < 5; i++) {
                  for(int j = 0; j <=i; j++) {
                      for(int d = 0; d < j; d++) {
                          System.out.printf("*");
                      }
                  }
                  System.out.println(); */
              
             
                      
                  

              
              
        
              
 

