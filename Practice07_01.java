// 以下の 条件分岐文を作成してください

import java.util.Random;

class Practice07_01 {
    public static void main(String[] args) {
        int gender = new Random().nextInt(2);
// 0 or 1 のランダムな 変数 gender を宣言

        if (gender == 0) {
            System.out.println("あなたは　男　です");
// 変数 gender の値が「0場合」は「あなたは 男 です」と表示させる

        } else if (gender == 1) {
            System.out.println("あなたは　女　です");
// 変数 gender の値が「1場合」は「あなたは 女 です」と表示させる
        }
     }
}

