package bitcamp.java100;

public class eden16{
    public static void main(String[]args) {
        String[] name = {"김이든","유관순","홍길동"};
        int[][] scores = {{100,200,300},{90,80,48},{40,20,10}};

        for(int i=0; i<3; i++){
            System.out.printf("%s %d %d %d ",name[i], scores[i][0],scores[i][1],
            scores[i][2]);
        }
        
      
  
}
}