package bitcamp.java100.Test21.ex8;

public class Arry {

    // Contact 값을 저장할 레퍼런스 배열을 만든다.
    static Contact[] contacts = new Contact[100];

    // 값이 저장될 위치
    static int cursor = 0;
    
    
    //contact 배열 을 다루는 메서드 분리 size add get
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
}
