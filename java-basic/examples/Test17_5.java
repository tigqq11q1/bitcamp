package bitcamp.java100;

public class Test17_5{
        
        static String m1() {
            return "helllo";
             }
        static int m2() {
            return 100;
        }
        static boolean m3() {
            return true;
        }
        //static int m4() { return "hello";} 미스매치 타입이 다르다 
        //static int m5() {} int값을 반환한다면서 반환하지 않음
        
        /*static int m6() {
            return    
            int a =100;    도달할 수 없는 코드  리턴하는 순간 메소드를 나가기에 
            a++;*/
        
         public static void main(String[]args) {
            //값을 반환하는 메소드 호출 
            String v = m1();
            System.out.println(v);
            //반환 받은 값을 변수에 저장하지 않고 바로 사용  
            System.out.println(m1());
            
            //String s = n2();리턴값 int인데 string 변수에 저장하려 해서 오류 
        }
}
       
       

 
