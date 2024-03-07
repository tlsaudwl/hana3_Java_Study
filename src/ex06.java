import java.util.Arrays;

public class ex06 {
    public static void main(String[] args) {
        // 문자열 관련 함수들
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        // 문자열 길이
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();
        // 문자 한자만 가져오기
        char c1 = str1.charAt(0); // 0은 맨 첫문자를 가져옴
        System.out.println(c1);
        char c2 = str1.charAt(1); // 1은 두번째 문자를 가져옴
        System.out.println(c2);
        // 문자열 위치(인덱스) 가져오기
        System.out.println(str1.indexOf("Java"));
        // 마지막 문자(열)의 위치
        System.out.println(str1.lastIndexOf("a"));

        String str3 = "Java Study";
        // 대문자로 바꾸기
        System.out.println(str3.toUpperCase());
        // 소문자로 바꾸기
        System.out.println(str3.toLowerCase());
        // 문자열로 검색시 다 소문자로 바꿔서 검색한다
        System.out.println(str3.toLowerCase().indexOf("java"));
        // 문자열 치환하기
        System.out.println(str3.replace("Study", "공부"));
        // 문자열 일부 가져오기
        System.out.println(str3.substring(0, 4));
        // 문자열을 분리해서 문자열 배열로 가져오기
        String[] strArray = "abc/def-ghi jkl".split("/|-| "); // (/ or - or 공백)
        System.out.println(strArray.length);
        // Arrays.toString() : 배열을 문자열로 변환해주는 함수
        System.out.println(strArray);
        System.out.println(Arrays.toString(strArray));
        // 문자열의 처음과 끝의 공백만 제거 - 가운데 공백은 안함
        System.out.println(" abc ".trim());
        System.out.println(" abc def ".trim());
        // 모든 공백을 제거하기
        System.out.println(" abc def ".replaceAll(" ", ""));
        // 문자열 연결 함수
        System.out.println("abc".concat("123"));
        // 문자열을 포함하는지 true/false로 반환하는 함수
        System.out.println("abc123".contains("123"));

        // 문자열 내용 비교하기
        String str4 = "Java";
        String str5 = "java";
        // 주소값 정수 비교
        System.out.println(str4 == str5);
        // 내용 비교
        System.out.println(str4.equals(str4));
        // 대부분의 언어들은 문자열 비교시 ==
        // 단 자바는 equals 함수를 사용해야 됨

        System.out.println();

        //연습문제 DM제출
        // String str5 = "java";
        String str6 = "Web Programming is funny~";
        String str7 = "  Test Trim String  ";
        //1. "funny"의 시작 인덱스를 출력하시오.
        //2. str6를 모두 대문자로 출력하시오.
        //3. str6를 모두 소문자로 ~
        //4. str5와 str6을 concat함수로 연결하여 출력하시오.
        //5. str7의 시작과 끝 공백만 제거하여 출력하시오.
        //6. str7의 모든 공백을 *로 치환하여 출력하시오.
        //7. str6은 "web"문자열을 포함하고 있는지? (대소문자 안가림)
        //   true/false로 출력하시오.
        //8. str6을 문자열 배열로 만들고, "Web"와 "funny~"만 출력하시오.
        System.out.println(str6.indexOf("funny"));
        System.out.println(str6.toUpperCase());
        System.out.println(str6.toLowerCase());
        System.out.println(str5.concat(str6));
        System.out.println(str7.trim());
        System.out.println(str7.replaceAll(" ", "*"));
        System.out.println(str6.toLowerCase().contains("web"));
        String[] str6Array = str6.split(" ");
        System.out.println(str6Array[0]);
        System.out.println(str6Array[3]);
    }
}
