package c02.lecture.p02type;

public class C05Byte {
    public static void main(String[] args) {

        //byte
        //최소값 -128
        //최대값 127
        //1byte의 저장공간으로 값을 표현(저장)
        //1byte===8bit
        //bit=0 또는 1

        //2진수 앞자리가 1이면 음수. 0이면 양수
        //256을 양수,음수로 반반씩 나눔.

        byte a = 23;
        byte b = 127;
        //byte c=128; x
        byte c = 0;
        byte d = -127;
        byte e = -128;


        /*1000 0000 = -128
        0111 1111 = 127
                ..
        0000 0010 = 3
        0000 0001 = 1
        0000 0000 = 0
        // 앞에 1이 있다고 생각하고 뺀 수
        1 0000 0000 에서 1을 뺐다고 생각
        1111 1111 = -1
        1111 1110 = -2
        1000 0001 = -127
        1000 0000 = -128 */

        System.out.println(a);
    }
}
