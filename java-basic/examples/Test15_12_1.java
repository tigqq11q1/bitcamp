package bitcamp.java100;

public class Test15_12_1{
        public static void main(String[] args){
            //비트 이동 연산자의 활용 예 
            
            int v = 87;//0000_0000_0000_0000_0000_0000_0101_0101
            
            //>>
            //오른쪽으로 비트 이동                                      // x000_0000_0000_0000_0000_0000_0010_1011|1
            System.out.println(v >> 1);// x000_0000_0000_0000_0000_0000_0101_0111
  
            System.out.println(v >> 2);//xx00_0000_0000_0000_0000_0000_0001_0101|11
                                       //빈자리는 부호 비트로 채운다 .
            System.out.println(v >> 3);
            System.out.println(v >> 4);
            
            v = -87; //나누기한 효과 
            System.out.println(v >> 1);      
            System.out.println(v >> 2);                                
            System.out.println(v >> 3);
            System.out.println(v >> 4);
            
            v = 87;
            System.out.println(v >>> 1);      
            System.out.println(v >>> 2);                                
            System.out.println(v >>> 3);
            System.out.println(v >>> 4);
            
            v = -87;
            System.out.println(v >>> 1);      
            System.out.println(v >>> 2);                                
            System.out.println(v >>> 3);
            System.out.println(v >>> 4);
 
                                            //<<왼쪽으로 비트를 이동 
                                           //오른쪽 빈자리는 0으로 채운다 
                                           //값에 2를 곱한 효과가 있다 .
            
            v = 5;                     //0000_0000_0000_0000_0000_0000_0000_0101
            System.out.println(v << 1);//0000_0000_0000_0000_0000_0000_0000_1010      
            System.out.println(v << 2);                                
            System.out.println(v << 3);
            System.out.println(v << 4);
           
            v = -5;
            System.out.println(v << 1);      
            System.out.println(v << 2);                                
            System.out.println(v << 3);
            System.out.println(v << 4);
            
            for(int i =0; i < 40; i++) {
                System.out.printf("%32s %d\n",Integer.toBinaryString(v<<i),v << i);
            }
     }
}



