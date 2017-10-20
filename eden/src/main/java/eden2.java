package bitcamp.java100;

public class eden2{
    public static void main(String[]args){
        class Score{
            String name;
            int age;
        }
        Score r1;
        r1 = new Score();

        r1.name = "김이든";
        r1.age = 25;

        System.out.printf("%s %d\n",r1.name,r1.age);
    }
}



