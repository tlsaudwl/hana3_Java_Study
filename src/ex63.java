// 제너릭 Generic
//      : 형(타입)에 따른 선언을 편하게 하기 위해 사용함
//      : JDK 1.5부터 지원
class Keyboard1 {
    private Object object; // 다형성을 이용한 모든 클래스 객체를 넣을 수 있다, 8개 기본형 : 래퍼클래스

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

class Keyboard2<MyType> { // MyType은 가변타입이다
    private MyType object;

    public MyType getObject() {
        return object;
    }

    public void setObject(MyType object) {
        this.object = object;
    }
}

public class ex63 {
    public static void main(String[] args) {
        Keyboard1 k1 = new Keyboard1();
        k1.setObject("키보드1");
        String str = (String) k1.getObject(); // 다운캐스트 해야하는 번거로움 생김

        Keyboard2<String> k2 = new Keyboard2<>();
        k2.setObject("키보드2");
        String str2 = k2.getObject();

        Keyboard2<Integer> k3 = new Keyboard2<>();
        k3.setObject(10);
        Integer i = k3.getObject();
    }
}
