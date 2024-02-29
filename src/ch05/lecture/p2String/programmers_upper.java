package ch05.lecture.p2String;

public class programmers_upper {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        String str = my_string.replace(alp, alp.toUpperCase());
        System.out.println("str = " + str);

        String myString = "AbCdEfG";
        String pat = "aBc";
        String my_upper = myString.toUpperCase();
        String pat_upper = pat.toUpperCase();
        System.out.println(my_upper);


        if (my_upper.contains(pat_upper))
            System.out.println("1");
        else {
            System.out.println("0");
        }

    }
}
