public class practice02 {
    public static void main(String[] args) {
        int lotto[] = new int[6];

        for (int i = 0; i < 6; i += 1) {
            int lottoNum = (int) (Math.random() * 45 + 1);
            lotto[i] = lottoNum;
            for (int j = 0; j < i; j += 1) {
                if (lotto[j] == lotto[i]) {
                    System.out.print(lotto[j]+" ");
                    System.out.print("중복발생! 재추첨 ");
                    i -= 1;
                    break;
                }
            }
            System.out.print(lotto[i] + " ");


        }
    }
}
