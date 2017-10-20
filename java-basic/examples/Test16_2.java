package bitcamp.java100;

public class Test16_2{
        public static void main(String[] args) {
           //조건문 IF 
            int age = 17;
            
            if(age <= 19) 
               System.out.println("미성년");
            else
               System.out.println("성년");
            
            age = 20;
            if(age <= 19) 
                System.out.println("미성년");
             else
                System.out.println("성년");
            
            System.out.println("---------------------------");
            
            age = 67;
            if(age >= 65) 
                System.out.println("경로우대 대상자입니다.");
            
             System.out.println("---------------------------");
             
            age = 27;
            if(age <= 19) 
                System.out.println("미성년입니다.");
                System.out.println("청소년 할인을 받을 수 있습니다.");
                
                System.out.println("---------------------------");
                
            age = 18;
            if (age <= 19) { 
                System.out.println("미성년입니다.");
                System.out.println("청소년 할인을 받을 수 있습니다.");
            }
            
            System.out.println("---------------------------");
            
            age = 13;
            if (age <= 19) 
                if (age > 13)
                System.out.println("청소년");
            
            System.out.println("---------------------------");
            
            age = 27;
            if (age <= 19)  //블록 사용하여 else 분리하지 않으면 실행은 아무것도 되지 않는다 
                if (age > 13) 
                System.out.println("청소년");
                else 
                    System.out.println("성년");
            
            System.out.println("---------------------------");
            
            age = 27;
            if (age <= 19) { //19세보잔 작지만 13세 보다 크다면 청소년 그것도 아니면 성년  
                if (age > 13) //블록 사용 하여 else 분리시킨다 , else 는 제일 가까운 if문에 묶인다 .
                System.out.println("청소년");
            } else 
                    System.out.println("성년");
            
            System.out.println("---------------------------");
            
            age = 13;
            if (age <= 19)  //19세보다 13세가 어리기에 if문 통과 어린이 및 유아가 실행 
                if (age > 13) 
                System.out.println("청소년");
                else 
                    System.out.println("어린이 및 유아");
            
            System.out.println("---------------------------");
            
            age = 23;
            if (age <= 19)   
                if (age > 13) 
                System.out.println("청소년");
                else 
                    System.out.println("어린이 및 유아");
                else //첫번째 if문과 연결된다 
                    System.out.println("성년입니다");
            
            System.out.println("---------------------------");
            
            age = 72;
            if (age <= 19) {                
                if (age > 13) 
                System.out.println("청소년");
                else 
                    System.out.println("어린이 또는 유아");
            }
            else {
                if (age < 65)
                    System.out.println("성년입니다");
                else 
                    System.out.println("노인입니다");
            } 
            
            System.out.println("---------------------------");
            
            age = 67;
            
            if (age <8)
                System.out.println("유아");
            else
                if (age <14)
                    System.out.println("어린이");
                else 
                    if (age <20)
                        System.out.println("청소년");
                    else
                        if (age <65)
                            System.out.println("성년");
                        else 
                            System.out.println("노인");
            
            System.out.println("---------------------------");
            
            age = 67;             //위에 코드를 아래와 같이 정리 
            
            if (age <8) {
                System.out.println("유아");
            } else if (age <14) {
                    System.out.println("어린이");
            } else if (age <20) {
                     System.out.println("청소년");
            } else if (age <65) {
                     System.out.println("성년");
            }else 
                     System.out.println("노인");
            
            
            
            
            
            
                   
            
        }
}

