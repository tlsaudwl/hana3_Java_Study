import java.util.Random;

public class ex14 {
    public static void main(String[] args) {
        // 선택제어문 - 조건문
        // 조건문 : if문 switch문
        // if문 4가지 패턴
        // 1. 단일 if문
        // * 조건식에는 비교/논리 연산자가 들어간다.
        if (10 < 20) {
            System.out.println("10이 20보다 작음");
        }
        if (10 > 20) // 실행문이 하나이면 생략 가능
            System.out.println("10이 20보다 작음1");
        System.out.println("10이 20보다 작음2");
        // 2. if else문
        if (10 > 20) {
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }
        // 3. if else if문
        int score = 90;
        if (score < 70) {
            System.out.println("70미만");
        } else if (score < 80) {
            System.out.println("80미만");
        } else if (score < 90) {
            System.out.println("90미만");
        } else {  // 그외의 경우
            System.out.println("90이상");
        }
        // 4. 중첩 if문
        if (10 % 2 == 0) {
            System.out.println("2의 배수");
            if (10 % 5 == 0) {
                // 조건식1 and 조건식2
                System.out.println("5의 배수");
            } else {
                // 조건식1 and !조건식2
                System.out.println("5의 배수아님");
            }
        }
        // 코딩 패턴
        if (10 < 20) {
            System.out.println("20이 더 큼!");
        }
        System.out.println();

        //연습문제 - DM제출
        //1.
        //철수와 영희가 주사위 놀이를 하고 있다.
        // 주사위 2개를 던져서,
        // 두개 다 짝수가 나오면 철수 승!
        // 두개 다 홀수가 나오면, 영희 승!
        // 그외의 경우는 무승부! 이다.
        // 게임의 결과를 출력하시오.
        Random rand = new Random();
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        System.out.println(dice1);
        System.out.println(dice2);
        if (dice1 % 2 == 0 && dice2 % 2 == 0) {
            System.out.println("철수 승!");
        } else if (dice1 % 2 == 1 && dice2 % 2 == 1) {
            System.out.println("영희 승!");
        } else {
            System.out.println("무승부!");
        }
        System.out.println();

        //2.
        //철수와 영희을 주사위게임을 하고 있다.
        //주사위 2개를 철수가 던지고,
        //주사위 2개를 영희도 던진다.
        //게임룰 : 첫번째 주사위는 십의 자릿수로하고,
        //        두번째 주사위는 일의 자릿수로 해서,
        // 더 높은 점수를 가진 사람이 승리한다.
        //출력값 예시 :
        //        철수 주사위1 수 : 1
        //        철수 주사위2 수 : 3
        //        철수의 점수는 13
        //        영희 주사위1 수 : 3
        //        영희 주사위2 수 : 4
        //        영희의 점수는 34
        //        영희 승!
        int dice3 = rand.nextInt(6) + 1;
        int dice4 = rand.nextInt(6) + 1;
        int scoreCholsu = dice3 * 10 + dice4;
        int dice5 = rand.nextInt(6) + 1;
        int dice6 = rand.nextInt(6) + 1;
        int scoreYounghee = dice5 * 10 + dice6;
        System.out.println("철수 주사위1:" + dice3);
        System.out.println("철수 주사위2:" + dice4);
        System.out.println("철수 점수:" + scoreCholsu);
        System.out.println("영희 주사위1:" + dice5);
        System.out.println("영희 주사위2:" + dice6);
        System.out.println("영희 점수:" + scoreYounghee);
        if (scoreCholsu > scoreYounghee) {
            System.out.println("철수 승");
        } else if (scoreCholsu < scoreYounghee) {
            System.out.println("영희 승");
        } else {
            System.out.println("무승부!");
        }

    }
}