
/*とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
人数を入力し、入場料の合計を計算するプログラムを作成してください。*/

import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        
        // 「入場人数を入力してください」という文と、入力された人数をコンソールに表示する
        // pp = people
        System.out.println("入場人数を入力してください");

        Scanner pp  = new Scanner(System.in);

        System.out.print("入場人数：");
        int visitor = pp.nextInt();

        // 入場料の合計を計算する
        if (visitor >= 5 && visitor <= 19) {
            int fee1 = 550 * visitor;
            System.out.println("入場料金合計" + fee1 + "円");

        } else if (visitor >= 20) {
            int fee2 = 500 * visitor;
            System.out.println("入場料金合計" + fee2 + "円");

        } else {
            int fee3 = 600 * visitor;
            System.out.println("入場料金合計" + fee3 + "円");
        }
    }
}