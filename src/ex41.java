// final이 클래스 안에서 사용될 때
// 1. final 필드 : 상수처럼 동작, 한번 값이 들어가면 다시 대입 안됨
// 2. final class : 상속 불가
// 3. final 메소드 : 오버라이드 불가
final class FinalClass { // 상속 불가 => 14번째 줄
    String name = "파이널 클래스";
    int age; // 0으로 초기화, heap영역의 참조변수는 강제초기화
    final int price = 1000; // 상수타입의 필드, final 시에는 반드시 초기화

    final void disp() {
    } // 오버라이드 불가 => 16번째 줄
}
/*
class LastClass extends FinalClass{ }

class LastClass2 extends FinalClass {
    @Override
    void disp() {
    }
}
*/

public class ex41 {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        // fc.price = 2000; // final이므로 값 넣을 수 없음

        // 상수 선언시
        final double PI = 3.141592;
        // PI = 6.13; // 다시 값을 넣으려고 하면 오류

    }
}
