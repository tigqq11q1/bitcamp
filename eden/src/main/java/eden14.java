package bitcamp.java100;

public class eden14{
    public static void main(String[]args) {
        int a = 10;
        int b = 20;
        int c;
        c = a + b;
        System.out.printf("%d %d %d\n",a,b,c);

        int[] hi = {100,200,300};
        int[][] gg = {{10,20},{300,400}};

        // System.out.printf("%d %d",hi[2],gg[1][0]);
        for(int i = 0; i< hi.length; i++){
            System.out.printf("%d\t",hi[i]);
        }



        for (int i = 0; i < gg.length; i++){

            for (int j = 0; j < gg[i].length; j++){
                System.out.printf("%d\t",gg[i][j]);
            }
        }

    }
}