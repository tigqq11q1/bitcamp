package bitcamp.java100;

public class Test18_7 {
     
    public static void main(String[] args) throws Exception {
        //Immutable 값 바꿀수 없는 객체 
        String s1 = "hello";
        //값 변경위해 새로울 객체를 생성 
        String s2 = s1.replace("l","x");
        
        System.out.println(s1);
        System.out.println(s2);
        
        //Mutable 값을 변경할 수 있는 객체 
        StringBuffer sb1 = new StringBuffer("hello");
        //값 변경하면 진짜 원본값이 변경됨 
        sb1.append("world!");
        
        System.out.println(sb1);
        
        sb1.replace(2, 3, "xx");
        System.out.println(sb1);
        
    }
}

















