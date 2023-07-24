public class Debug {
    public static void main(String[] args) {

        // デバック実行を行う

        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (sum > 30) {
                System.out.println("sum");
                break;
            }
            if (i % 2 == 0) {
                printStar(i);
                sum += i;
            }
        }
    }

    private static void printStar(final int num) {
        System.out.println("*".repeat(num));
    }
}