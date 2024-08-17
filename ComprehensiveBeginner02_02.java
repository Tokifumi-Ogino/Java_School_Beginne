/*ジャンケンプログラムを作成してください。
"ジャンケン"と表示させる
"0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
それ以外の数字が入力された場合、エラーとして説明した後に 1. に戻るようにする
今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する */

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {
        System.out.println("ジャンケン");

            // 以下メソッド呼び出し
            // プレイヤーの手をキーボードから得る
            int me = getMyHand();

            // PCの手をランダム生成
            int com = getComHand();
    
            // 勝敗判定
            String result = playJanken(me, com);

            // メソッド呼び出し　判定結果の表示
            theResult(me, com, result);
    }
    
    public static int getMyHand() {
        Scanner scanNum = new Scanner(System.in);
        // 無限ループ
        while (true) {
            System.out.println("0:グー 1:チョキ 2: パー >　数字を入力してください");
            
                // ”hasNextIntメソッド”を使って次の入力が整数であるかどうかを確認
                if (scanNum.hasNextInt()) {
                    int myHand = scanNum.nextInt();

                    // 入力された数字が0から2の範囲内か確認
                    if (myHand < 0 || myHand >2) {
                        System.out.println("Error - 入力可能な数字は０から２までの整数です！");
                        continue;
                    } else {
                        return myHand;
                    }
                } else {
                    scanNum.next(); //整数以外の入力を読み飛ばすため
                    System.out.println("Error - 文字は無効です！整数を入力してください！");
                }
        }
    }

    public static int getComHand() {
        Random rd = new Random();
        return rd.nextInt(3);
    }

    public static String playJanken(int me, int com) {
        String result = ""; // 判定結果を保存する
        
        if ((me == 0 && com == 1) || (me == 1 && com == 2) || (me == 2 && com == 0)) {
            result = "勝ち";

        } else if ( (me == 0 && com == 2) || (me == 1 && com == 0) || (me == 2 && com == 1)) {
            result="まけ";

        } else {
            result = "あいこ";
        }
        return result;
    }

    public static void theResult(int me, int com, String result) {
        String[] hands = {"グー", "チョキ", "パー"};
        System.out.println("あなたの手: " + hands[me]);
        System.out.println("コンピュータの手: " + hands[com]);
        System.out.println("結果: " + result);

    }
}