package bitcamp.java100;

public class edne1 {

    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        for (int q = 2; q <= 9; q++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d\n", q, j, q * j);
            }
        }

        for (int i = 2; i <= 9; i++) {
          {
                System.out.println("***"+ i + "단***");
            }   for (int y = 1; y <= 9; y++) {
            System.out.println(y +"x"+"="+ (y *i));
        }
    }
}
}