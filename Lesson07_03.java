import java.util.Random;
class Lesson07_03 {
    public static void main(String[] args) {
        System.out.println("あなたの運勢を占います");
        // １〜４の乱数を　fortune　に代入
        int fortune = new Random().nextInt(4) + 1;

        switch (fortune) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("凶");
                break;
        }
    }
}
