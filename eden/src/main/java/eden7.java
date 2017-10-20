package bitcamp.java100;

public class eden7{
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
            Score[] scores = new Score[2];
            scores[0] = new Score();
            scores[1] = new Score();

            scores[0].name = "김이든";            
            scores[0].eng = 100;
            scores[0].math = 90;
            scores[0].kor = 80;
            scores[0].compute();

            scores[1].name ="홍길동";
            scores[1].eng = 50;
            scores[1].math = 40;
            scores[1].kor = 95;
            scores[1].compute();

            System.out.printf("%s %d %s %d\n",scores[0].name, scores[0].math, scores[1].name, scores[1].kor);
            for (int i = 0; i < scores.length; i++){
                System.out.printf("%s %d %d %d %d %f\n"
                ,scores[i].name,
                scores[i].eng,scores[i].math, scores[i].kor,
                scores[i].sum,scores[i].aver);}
            }
            



        }
        
    
    



