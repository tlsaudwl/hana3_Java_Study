// static 초기화 블럭
class StaticClass {
    int a;
    static int b = 0; // 프로그램 시작시 초기화됨

    static { // 클래스 호출시 처음 한번만 호출됨 => new를 안해도 호출됨
        b = 5;
        System.out.println("static block");
    }

    StaticClass() { // 생성자 함수는 new를 해야 호출됨
        a = 3;
        b = 10;
    }
}

public class ex35 {
    public static void main(String[] args) {
        System.out.println(StaticClass.b);
        StaticClass s = new StaticClass();
        System.out.println(StaticClass.b);
    }
}
