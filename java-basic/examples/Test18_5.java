package bitcamp.java100;

public class Test18_5 {
    // sting 인스턴스에 대해 사용 가능한 기타 인스턴스 메소드
    public static void main(String[] args) throws Exception {
        // 상수풀에 생성
        String s1 = "ABC가각간";
        // replace()
        String s2 = s1.replace("BC", "하하하");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.charAt(4));// 문자열에서 특정 위치 문자 찾아 리턴 ..인덱스는 0부터 시작....

        s1 = "ABBCDEBBFGH";
        System.out.println(s1.indexOf("BB")); // 앞에서 부터 문자열 찾는다 ...찾은 문자열의 인덱스를 리턴

        // lastindexOf(찾을문자열)..뒤에서부터 찾는다
        System.out.println(s1.lastIndexOf("BB"));
        // substring (추출한 문자열의 시작 인덱스)
        System.out.println(s1.substring(3));
        // substring(추출한 문자열의 시작과 끝 인덱스)
        System.out.println(s1.substring(3, 6));

        s1 = "홍길동";
        // startswith (시작문자열)
        System.out.println(s1.startsWith("홍"));
        // endswhis (끝문자열)
        System.out.println(s1.endsWith("동"));
        // contains(포함 문자열)
        s1 = "홍길동, 유관순 , 임꺽정, 안중근, 윤봉길, 이육사, 윤동주";
        System.out.println(s1.contains("꺽정"));
        System.out.println(s1.contains("이든"));
        // concat (추가할 문자열) 해당 문자열에 주어진 문자열을 추가히여 새 string 인스턴스를 만든다
        String s3 = "ABC";
        String s4 = "가각간";
        System.out.println(s3.concat(s4));
        // 주의 기존 string 인스턴스의 값은 봐뀌지 않는다 이뮤터블객체
        System.out.println(s3);
        System.out.println(s4);

        s3 = new String("탕수육");
        s4 = new String("탕수육2");
        String s5 = new String("탈수육");
        String s6 = new String("탕수육");
        // compareTo (두문자열 비교 하여 같으면 0을 리턴)
        // 문자열1이 문자열2 앞서면 음수 리턴
        // 문자열 1이 문자열2 보다 뒤면 양수 숫자는 신경쓰지 말고 음수와 양수 인것이 중요
        System.out.println(s3.compareTo(s6));
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s5));

        s1 = "홍길동";
        s2 = "";// 빈문자열
        s3 = null;// 인스턴스 없음
        // isEmpty()
        // String 인스턴스에 저장된 문자열이 비어 있는지 검사
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        // System.out.println(s3.isEmpty()); 컴파일 오류
        // 빈문자열과 string 인스턴스 없음은 다르다
        // 빈문자열도 string 인스턴스이다

        // length() 문자의 개수
        System.out.println(s1.length());
        System.out.println(s2.length());
        // System.out.println(s3.length());

        s1 = "홍길동, 유관순 ,, 임꺽정, 안중근, 윤봉길, 이육사, 윤동주";
        //split 해당 문자열 구분자로 분리 string[] 배열로 만들어 리턴 
        String[] arr = s1.split(",");
        for (String s : arr) {
            System.out.print(s);
            System.out.print("-");
        }
        System.out.println();
        
        arr = s1. split(" ");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        
        //빈문자열도 문자열이기 때문에 배열로 리턴된다 
        s1 = "";
        arr = s1. split(",");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        
        //소문자로 변환//대문자로 변환 
        s1 = "Hong Gil Dong";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
       
         //공백을 없앤다 . 양쪽 공백만 날리고 중간 공백은 날리지 않는다 
        s1 = "  \t홍\t길 동  \n입니다\n\n\n\t";
        System.out.print(">");                     //공백: white space  
        System.out.print(s1.trim());              //스페이스 ,탭  ,줄봐꿈 모두 공백 으로 취급..빈칸 한개 
        System.out.println('<');
        
        //getByte() 문자집합 
        //>jvm 설정된 코드 값으로 추출됨 
        //추출된 문자 코드는 바이트 배열에 저장되어 리턴 
        s1 = "ABC\n가각간\n똘똠똥";
        byte[] bytes = s1.getBytes();
        for(byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }
        //가능한 문자 집합을 명시하여 바이트 배열을 만들어라 
        //os에 상관없이 동일한 결과를 얻을 수 있다 
        bytes = s1.getBytes("UTF-8");
        for(byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }
        //항상 자바는 네트워크로 전송할때 바이트 배열로 만들어 제공하는게 기본이다 
        //씨언어는 char이 1바이트 자바의 char은 2바이트 이기 에 서로 다르기 때문이다 
     
       
        //String의 클래스 메서드
        //value0f(값)
        //주어진 값을 가지고 string 인스턴스를 생성하는 메서드
        s1 = String.valueOf(true);
        s2 = String.valueOf(3.14);
        s3 = String.valueOf(100);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        //문자열을 다루는 특별한 연산자 '+'
        //두 문자열을 연결 새 string 인스턴스 생성 
        s1 = "ABC";
        s2 = "가각간";
        s3 = s1 + s2;//ABC가각간
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }
}

















