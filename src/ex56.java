public class ex56 {
    public static void main(String[] args) {
        // throws 문 : 자신을 호출한 메소드에 예외처리를 떠넘기는 것
        try {
            myFunc();
        } catch (Exception e) {
            MyException e2 = (MyException) e;
            e2.printMessage();
        }
    }

    // 내 코드를 깔끔하게 빨리 처리하기 위해서
    static void myFunc() throws Exception {
        System.out.println("myFunc");

        // System.out.println(10 / 0);

        // 강제로 예외 발생
        int i = 10;
        if (i < 20) {// 더이상 처리할 의미가 없을 때
            MyException e = new MyException();
            e.message = "사용자 예외";
            throw e;
            // 일반적인 경우 => throw new Exception();
        }
    }
}

// 사용자 정의 예외
class MyException extends Exception {
    String message = "";

    public void printMessage() {
        System.out.println(this.message);
    }
}
