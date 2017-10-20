package bitcamp.java100;

public class eden6{
    public static void main(String[]args){
        class Score {
            String name;
            int eng;
            int math;
            int kor;
            int sum;
            float aver;

            void compute() {
                sum = eng + math + kor;
                aver = sum /3.0f;
            }

        }
        Score s1 = new Score();
        s1.name = "김이든";
        s1.eng =100;
        s1.math = 200;
        s1.kor = 50;
        s1.compute();
        
        System.out.printf("%s %d %d %d %d %f\n",s1.name, s1.eng,s1.math,s1.kor,s1.sum, s1.aver);

        Score s2 = s1;
        s1 = new Score();
        s1.name = "홍길동";
        s1.eng = 20;
        s1.math = 30;
        s1.kor = 50;
        s1.compute();

        System.out.printf("%s %d %d %d %d %f\n",s1.name, s1.eng,s1.math,s1.kor,s1.sum, s1.aver);
        
        
    }
    }




