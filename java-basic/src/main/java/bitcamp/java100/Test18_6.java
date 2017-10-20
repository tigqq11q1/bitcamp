package bitcamp.java100;

public class Test18_6 {
    // 정규식 이용하여 문자열 검사 
    public static void main(String[] args) throws Exception {
       String email = "kim@test.com"; 
       //match(정규표현식)            Regular Expression
       //정규표현식 의  규칙과 맞는지 검사 리턴값은 true/false
       System.out.println(email.matches("kim@test.com"));
       
       System.out.println(email.matches(".+@.+\\..+"));
       
       System.out.println(email.matches("^\\D.+@.+\\..+"));
       
       // .  임의의 문자 한 개 
       // + 한 개 이상 , * 0 개 이상, ? 0 또는 한 개 
       // \. 그냥 dot 문자 
       // \D 숫자를 제외한 문자 
       System.out.println("--------------------------");
       String str = "홍길동(hong@test.com),임꺽정(lee@test.com)"+
       "유관순(yoo@test.com),안중근(ahn@test.com),윤봉길(yoon@test.com)";
       
       java.util.regex.Pattern pattern =
               java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
       
       java.util.regex.Matcher matcher = pattern.matcher(str);
       
       int startIndex = 0;
       while ( matcher.find(startIndex)) {
           System.out.println(startIndex);
         String matchString = matcher.group();
           startIndex = matcher.end();
           System.out.println(matchString);
       }
    }
}

















