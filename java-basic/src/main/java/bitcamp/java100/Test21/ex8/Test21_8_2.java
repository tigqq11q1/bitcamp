    package bitcamp.java100.Test21.ex8;

import java.io.Console;


public class Test21_8_2 {
    
    // 콘솔 객체를 준비한다.
    static Console console;
    
    //사용자와 입력을 받거나 출력을 하는 you ,i 
    //출력하고 물어보고 저장하는 메소드들...
    
    static void printContacts() {
        // 배열에 저장된 값을 출력한다. //....분류명을 적어준다 
        for (int i = 0; i < Arry.size(); i++) {
            Contact contact = Arry.get(i);
            System.out.printf("%s, %s, %s\n", 
                    contact.name, 
                    contact.email, 
                    contact.tel);
        }
    }
    
    static boolean confirm(String message) {
        String input = console.readLine(message + "(y/n) ");
        if (input.toLowerCase().equals("y") || 
              input.toLowerCase().equals("yes"))
            return true;
        return false;
    }
    
    static Contact inputContact() {
        // 사용자가 입력한 데이터를 저장할 메모리 준비
        Contact contact = new Contact();
        
        // 사용자가 입력한 데이터를 Contact 인스턴스(객체)에 저장한다.
        contact.name = console.readLine("이름? ");
        contact.email = console.readLine("이메일? ");
        contact.tel = console.readLine("전화? ");
        
        return contact;
    }
    
    

    public static void main(String[] args) {
        
        console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        
        // 배열의 개수 만큼 입력을 받는다.
        while (true) {
            
            Contact contact = inputContact();
            
            if (confirm("저장하시겠습니까?")) {
                try {
                Arry.add(contact);
            }catch (RuntimeException e) {
                System.err.println("최대 저장 개수를 초과하였습니다! ");
                break;
            }
            
            if (!confirm("계속 입력하시겠습니까?"))
                break;
        }
        
        printContacts();
        
    }
}
}




//예외처리 ...24시간 계속 돌아가야하는 서버에서 예외처리가 떳다고 멈추면 안되니까 ...
//검생엔진에서 에러가 떳다고 프로그램이 종료되서 다른사람이 못쓰면 안되니까 






   
    
   
  