package bitcamp.java100;

public class Test20_2 {

    public static void main(String[] args) throws Exception {

        int i = 100;
        //오토 박싱
        Integer r1 = 100;//new Integer(100) 자동화 지원됨
        Integer r2 = new Integer(300);
        //오토 언박싱 
        int i2 = r2;//r2.intValue()


    }
}
