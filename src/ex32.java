// 싱글톤(Singleton)
// : 프로그램안에서의 유일한 클래스 객체
// : new를 통해서 여러개의 객체를 반복적으로 찍어낼 수 있다
// : 예) 붕어빵1, 붕어빵2, ...
//      절대붕어빵(유일한 붕어빵)
// 유일한 객체가 필요한 이유 : 유일한 정보를 저장하기 위해서
class FishBun { // 일반 붕어빵 : 일반 객체
    int bunNo = 10;
}

class UniqueFishBun { // 절대 붕어빵 : 싱글톤
    int bunNo = 30;
/*    private static UniqueFishBun singleton = new UniqueFishBun(); // 자기 자신의 객체를 내부적으로 소유함
    static UniqueFishBun getInstance(){
        return singleton;
    }*/

    // 이렇게도 사용함
    private static UniqueFishBun singleton; // null

    static UniqueFishBun getInstance() {
        if (singleton == null) {
            singleton = new UniqueFishBun();
        }
        return singleton;
    }
}

public class ex32 {
    public static void main(String[] args) {
        UniqueFishBun uBun1 = UniqueFishBun.getInstance(); // line 31, 32는 동일함
        UniqueFishBun uBun2 = UniqueFishBun.getInstance();
        System.out.println(uBun1); // 3b07d329
        System.out.println(uBun2); // 3b07d329

        FishBun bun1 = new FishBun();
        FishBun bun2 = new FishBun();
        FishBun bun3 = new FishBun();
        System.out.println(bun1); // bun1의 메모리 주소 : 3b07d329
        bun1.bunNo = 20;
        System.out.println(bun2); // bun2의 메모리 주소 : 41629346
        System.out.println(bun1.bunNo);
        System.out.println(bun2.bunNo);
        // 일반객체는 일관된 데이터를 저장할 수 없다, dynamic 하다, 객체의 생성과 소멸이 자유롭게 이루어진다
        // GC(Garbage Collector)가 자동으로 메모리를 회수한다
    }
}
