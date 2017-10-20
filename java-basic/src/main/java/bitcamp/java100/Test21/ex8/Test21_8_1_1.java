  package bitcamp.java100.Test21.ex8;

import java.io.Console;


public class Test21_8_1_1 {
    
    // 콘솔 객체를 준비한다.
    static Console console;
    
    // Contact 값을 저장할 레퍼런스 배열을 만든다.
    static Contact[] contacts = new Contact[100];
    
    // 값이 저장될 위치
    static int cursor = 0;
    
    // 새 데이터 타입 정의
    static class Contact {
        String name;
        String email;
        String tel;
    }
    
    static void printContacts() {
        // 배열에 저장된 값을 출력한다.
        for (int i = 0; i < size(); i++) {
            Contact contact = get(i);
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
    
    static void add(Contact contact) {
        //add 와 밑에 catch 주석처리하면 예외처리가 적용되지 않아 
        //시스템을 멈춘다  ..시스템을 실행중 예외처리를 만나면 시스템이 종료되는데 
        //시스템을 멈추는걸 막기위해 예외처리가 필요한것이다.
        if (cursor >= contacts.length)
            throw new RuntimeException("최대 저장 개수 초과");
        contacts[cursor] = contact;
        cursor++;
    }
    
    static Contact get(int index) {
        if (index < 0 || index >= cursor)
            throw new RuntimeException("유효하지 않은 인덱스");
        return contacts[index];
    }
    
    static int size() {
        return cursor;
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
                add(contact);
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





