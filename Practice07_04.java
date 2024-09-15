import java.util.Random;

class Practice07_04 {
    public static void main(String[] args) {
        int color = new Random().nextInt(5) + 1;
        // 1 ~ 5 のランダムな 変数 color を宣言
            System.out.println(color);

        // if (color == 1) {
            // System.out.println("今日のラッキーカラーは ピンク です");

        // } else if (color == 2 || color ==3 || color == 4) {
            // System.out.println("今日のラッキーカラーは レッド です");

        // } else if (color == 5) {
            // System.out.println("今日のラッキーカラーは ゴールド です");
            switch (color) {
                case 1 -> System.out.println("今日のラッキーカラーは ピンク です");
                case 2, 3, 4 -> System.out.println("今日のラッキーカラーは レッド です");
                case 5 -> System.out.println("今日のラッキーカラーは ゴールド です");
            }
        }
    }