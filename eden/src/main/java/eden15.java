package bitcamp.java100;

public class eden15{
    public static void main(String[]args) {
    int[][] arr1 = new int[][]{
        {10},
        {20,30},
        {100,400,500},
        {30,20,40,50,60}
    };

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < arr1[i].length; j++){
    System.out.printf("%d\t",arr1[i][j]);
    }
   System.out.println();
    }
}
}