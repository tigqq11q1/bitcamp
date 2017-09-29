package bitcamp.java100;

public class Test14_3{
        public static void main(String[] args) {
              class bitcamp{
                    String name;
                    String sex;
                    String addres;
                    int phone;
              }
                   bitcamp e1;   //e1은 주소를 저장하는 변수 레퍼런스

                    e1 = new bitcamp();//new연산자 사용하여 객체 생성 

                  


                    e1.name = "김이든";
                    e1.sex = "여";
                    e1.addres = "관악구";
                    e1.phone = 10;

                    System.out.printf("%s %s %s %d\n", e1.name, e1.sex, e1.addres, e1.phone);

                

              }
             
            
      }

