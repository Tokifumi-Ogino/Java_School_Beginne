import java.util.Random;

class Practice07_02 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
            System.out.println(age);
        // 0 ~ 20 のランダムな 変数 age を宣言

        if (age <= 3) {
            System.out.println("あなたは baby です");
            // 変数 age の値が「3以下の場合」は「あなたは baby です」と表示させる
        } else if (age > 3 && age < 18) {
            System.out.println("あなたは kid です");
            // 変数 age の値が「3より大きく、18未満の場合」は「あなたは kid です」と表示させる
        } else if (age >= 18) {
            System.out.println("あなたは adult です");
            // 変数 age の値が「18以上の場合」は「あなたは adult です」と表示させる
        }
    }
}