package bitcamp.java100;

public class Test14_6{
        public static void main(String[] args) {
     class Score {
           String name;
           int kor;
           int eng;
           int math;
           int sum;
           float aver;
      }
      
      Score[ ] scores = new Score[3];

      scores[0] = new Score();
      scores[1] = new Score();
      scores[2] = new Score();
      
      scores[0] .name = "홍길동";
      scores[0].kor = 100;
      scores[0].eng = 100;
      scores[0].math = 100;
     

      scores[1].name = "임꺽정";
      scores[1].kor = 90;
      scores[1].eng = 90;
      scores[1].math = 90;
      

      scores[2].name = "유관순";
      scores[2].kor = 80;
      scores[2].eng = 80;
      scores[2].math = 80;


      for(int i =0; i < scores.length; i++){
            System.out.printf("%s %d %d %d\n",
            scores[i].name, scores[i].kor, scores[i].eng, scores[i].math);
      }
      


      
      
           
     }
      }



