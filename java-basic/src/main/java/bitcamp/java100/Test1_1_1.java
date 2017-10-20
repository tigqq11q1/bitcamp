package bitcamp.java100;

public class Test1_1_1{
        public static void main(String[] args) {
       
            String s1 = "사원";
            
            switch(s1) {
                case "부장":
                   System.out.println("700만원");
                   break;
                case "과장":
                    System.out.println("500만원");
                    break;
                case "사원":
                    System.out.println("300만원");
                    break;
                    default:
                        System.out.println("200만원");
            }
            
            
            System.out.println("---------------------");
            
            int score = 70;
            if (score >=90) {
                System.out.println("a등급입니다");
            }else if(score >=80) {
                    System.out.println("b등급입니다");
                }else if (score >=70) {
                   System.out.println("c등급입니다");
                }else 
                    System.out.println("d등급입니다");
                           
           System.out.println("---------------------");
           
           String s2 = "강물";
                
           switch(s2) {
               case "꽃":
                   System.out.println("꽃");
                   break;
               case "하늘":
                   System.out.println("하늘");
                   break;
               case "강물":
                   System.out.println("강물");
                   break;
               case "나무":
                   System.out.println("나무");
                   break;
                   default:
                       System.out.println("나비");
      
        }
           System.out.println("---------------------");
           
           int a = 0;
           a += 100;
           System.out.println(a);
           
           int b = 120;
           b -= a;
           System.out.println(b);
           
           System.out.println("---------------------");
           
           int i = 0;
           int r = 0;
           
           while (i < 10) {
               r += ++i;               //i는 10 r은55
           }
           System.out.printf("i = %d, r =%d\n",i,r);
           
           System.out.println("---------------------");
           
           for(int j =1; j<=5; j++) {
               System.out.println(j);
           }
        
           System.out.println("---------------------");
           
           /*int sum = 0;
           
           for(int w = 1; w<=10; i++) {
               sum += w;
               System.out.println("1~10 합:"+ sum);
           }*/
           System.out.println("---------------------");
           int sum =0;
           int q = 0;
           for(q = 1; q<=100; q++) {
               sum += q;
           }
           System.out.println("1~"+(q-1) + "합:" + sum);
           
           
           
           
           
}
}