public class ex08 {
    public static void main(String[] args) {
        // 단항 : ++ -- !(논리반전) (타입) ~(비트반전)
        int i = 10;
        i++; // i = i + 1;
        System.out.println(i);
        i--; // i = i - 1;
        System.out.println(i);

        // 앞++/-- 뒤++/--
        // ++변수 : 먼저 ++되고 다음 연산에 참여한다
        // 변수++ : 다음 연산으로 넘어가면서 ++됨
        i = 10;
        int j = 20;
        System.out.println(i++ + ++j - i++);
        System.out.println(i);
        System.out.println(j);

        // 연습문제
        i = 10;
        j = 20;
        System.out.println(--i + j++ - ++j);

        boolean b = true;
        System.out.println(!b);
        System.out.println(!!b);

        j = 20;
        short s = (short) j; // 작은 타입 <= 큰 타입 : 강제형변한

        int k = 10; // 32bit 000000....1010
        int m = ~k; //       111111....0101
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(String.format("%032d", k));
    }
}
