package bitcamp.java100;

public class Test15_11_2{
        public static void main(String[] args){
            //배열 이용하여 처리 
            
         //메모리를 여러개 만든 후 그 주소를 보관 
             boolean[]arr = new boolean[10];
            //배열에 값저장 
            arr[0] = false;
            arr[1]= true; 
            arr[2]= true;
            arr[3]= true;
            arr[4]= true;
            arr[5] = false;
            arr[6] = true; 
            arr[7] = true;
            arr[8] = false;
            arr[9]= true;
            
    
                System.out.print(arr[0] ? "d":"-");
                System.out.print( arr[1]? "r":"-");
                System.out.print(arr[2] ? "w":"-");
                System.out.print(arr[3] ? "x":"-");
                System.out.print( arr[4]? "r":"-");
                System.out.print(arr[5]? "w":"-");
                System.out.print(arr[6]?"x":"-");
                System.out.print(arr[7]? "r":"-");
                System.out.print( arr[8]? "w":"-");
                System.out.print(arr[9] ? "x":"-");
                
             
          
     }
}



