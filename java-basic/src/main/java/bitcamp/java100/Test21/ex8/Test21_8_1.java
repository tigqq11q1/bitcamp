package bitcamp.java100.Test21.ex8;

import java.io.Console;


public class Test21_8_1 {

    // int cursor = 0; 앞에 static을 붙여야 다른 메소드에서 호출이 가능하ㅏ
    static class Contact {
        String name;
        String email;
        String tel;
    }

    public static void main(String[] args) {
        // main안에서는 메소드를 분리시킨것들을 호출할 코드를 작성한다
        // ex)printContacts();
        
        //public class 밑에 static 붙여서 
        Console console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        //pulic class 밑에 static 붙여서 
        Contact[] contacts = new Contact[100];
        
        //public class 밑에 static 붙여서 
        int cursor = 0;
        //조건에 (true)...
        while (cursor < contacts.length) {

            Contact contact = new Contact();

            contact.name = console.readLine("이름? ");
            contact.email = console.readLine("이메일? ");
            contact.tel = console.readLine("전화? ");

            // if (confirm("저장하시겠습니까?")) {} 코드가 줄어든다
            String response = console.readLine("저장하시겠습니까?(y/n)");

            if (response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")) {

                contacts[cursor] = contact;

                cursor++;
            }

            // input으로 변경 //사용자에게 질문하는 코드 따로 분리
            // if ( ! confirm("저장하시겠습니까?")) {} 코드가 줄어든다
            response = console.readLine("계속 입력하시겠 습니까?(y/n)");
            if (!(response.toLowerCase().equals("y") || response.toLowerCase().equals("yes")))

                break;

        }
        
        // print출력할 코드를 메소드로 만든다
        for (int i = 0; i < cursor; i++) {
            System.out.printf("%s %s %s\n",
                    contacts[i].name, 
                    contacts[i].email,
                    contacts[i].tel);

        }
    }

}
