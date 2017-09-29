//ver 01
//-표준 출력장치로 인사문구 출력하기
//ver02 
//학생 한명의 성적 점수를 출력하라!
//-이름,국어,영어,수학,총점,평균
//예)이름:홍길동 국어:100 영어:100 수학:100 총점:300 평균:100.0
//ver04
//여러 명의 성적을 저장하고 다음과 같이 출력하라 
///홍길동 임꺽정 유관순 
public class App {


    public static void main(String[] args) {
        String[ ]names={"홍길동","임꺽정","유관순"};
        int[ ]kor={100,90,80};
        int[ ]eng={80,80,80};
        int[ ]math={100,100,100};
        for(int i=0; i<names.length;i++){
            int sum=kor[i]+eng[i]+math[i];
            float aver=sum/3.0f;
            System.out.printf("%-4s %4d %4d %4d %4d %6.1f\n"names,kor[i],eng[i],math[i],sum,aver);
        
        }
    
    }


    }






     
         
    
