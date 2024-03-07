public class ex04 {
    public static void main(String[] args) {
        // 형변환 type casting
        // 형변환 공식
        // 1. 작은 정수형 -> 큰 정수형 (문제없음)
        // 2. 큰 정수형 -> 작은 정수형 (표현범위 벗어나면 값 잘림)
        // 3. 실수형 -> 정수형 (값 잘림, 소숫접 날아감)
        // 4. 정수형 -> 실수형 (문제 없음)

        // 자동 형변환 : 대입(산술)연산자를 통해 자동으로 형변환 됨
        // 수동 형변환 : 형변환 연산자 (타입)을 통해 형변환 할때

        // 자동 형변환 예)
        // 1. 같은 타입끼리 연산될때
        // int * int => int / long * long => long
        int i = 10;
        int j = 20;
        int k = i * j;
        // 2. 다른 타입끼리 연산될때 => 더 큰 타입으로 변환
        // int * long => long / long * float => float
        long m = 10 * 20L;
        // 3. 작은 타입에서 큰 타입으로 대입될때
        long a = 10; // int
        // 4. 큰 타입에서 작은 타입으로 대입될때
        //int b = 20L; // 형변환 안됨, 수동 형변환 해야 됨

        // 수동(강제) 형변환
        // 형변환 연산자 사용
        // 주의 할 점 => 표현범위를 벗어나면 값 잘림(쓰레기 값)
        // 작은 타입 = (작은 타입)큰 타입;
        int c = (int) 20L;

        //연습문제 3 - DM으로 제출
        //1. short형 변수 num1을 선언하고 10값을 넣어서 초기화 한다.
        //   int형 변수 num2를 선언하고 20값을 넣어서 초기화 한다.
        //   num1을 float형 변수 num3에 넣어서(대입) 자동형변환 시키자.
        //2. num2를 num1에 대입해서 강제 형변환 시킨 후 그 값을 출력하자.
        //3. num3와 num2값을 곱하기 연산(*)한 후 자동 형변환 한 값을 출력하자.
        short num1 = 10;
        int num2 = 20;
        float num3 = num1;

        num1 = (short) num2;
        System.out.println(num1);

        float num4 = num3 * num2;
        System.out.println(num4);
    }
}
