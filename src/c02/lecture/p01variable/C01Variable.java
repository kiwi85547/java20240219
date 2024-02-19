package c02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
//        변수: variable 값을 저장하는 공간의 이름
//        변수 선언 : 저장공간을 만듬
//        타입명 변수명
        int a;  //int 타입의 저장공간 마련, 공간의 이름은 a
//        변수에 값 저장(assignment,할당,대입)
//        변수명=값
        a=10;
        a=9;
        System.out.println(a);

        int b=109;
        System.out.println(b);
//        변수명에 사용할 수 있는 문자들
//        영문 대소문자, 숫자, $, _
//        숫자 ,로 시작할 수 없다.
//        _로만 작성할 수 없음.
        int $;
        int c_D;

//        변수명 작성 관습
//        소문자로 시작, 여러단어의 조합이면 각단어의 앞글자만 대문자
//        lowerCamelCass

        int age;
        int ageOfJames;
        int address;
        int addressOfJane; //관습 ok
        int address_of_jane; //관습 x

//        int age; // 같은 변수명을 다시 선언할 수 없음.

        // 자바의 키워드(예약어)는 변수명으로 사용할 수 없음.
//        int package;
//        int void;
//        int float;

    }
}