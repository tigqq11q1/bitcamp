package bitcamp.java100;

public class Test15_12_2{
        public static void main(String[] args){
            //비트 이동 연산자 응용 
            int v = 1234567890;
            
            System.out.println(Integer.toHexString(v));//16진수로 출력 
            
            System.out.println(Integer.toHexString(v >> 24));
            
            System.out.println(Integer.toHexString((v >> 16) & 0xFF));
            System.out.println(Integer.toHexString((v >> 8) & 0xFF));
            System.out.println(Integer.toHexString(v& 0xFF));
            
     }
}



