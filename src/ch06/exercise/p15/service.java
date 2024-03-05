package ch06.exercise.p15;

public class service {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}

class MemberService {
    boolean login(String id, String password) {
        boolean result = (id == "hong" && password == "12345");
        if (result)
            return true;
        return false;

        /* 선생님 코드. 한줄로 할 수 있지만 길게 하셨다고 함
        boolean isHong=id.equals("hong");
        boolean is12345=password.equals("12345");
        if(isHong && is12345){
            return true;
        }return false;
         */
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}