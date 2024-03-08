public class practice02 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i += 1) {
            int lottoNum = (int) (Math.random() * 45 + 1);
            System.out.println(lottoNum);
            lotto[i] = lottoNum;
            for (int j = 1; j < i; j += 1) {
                if (lotto[i] == lotto[j]) {
                    System.out.println("중복수:" + lotto[i]);
                    i -= 1;
                    break;
                }
            }
        }
    }
}
