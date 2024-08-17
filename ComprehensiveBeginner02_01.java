/*スロットマシーンプログラムを作成してください。
"ゾロ目で大当たり！チャンスは30回"と表示させる
"begin と入力してください> " と入力すると、開始するようにする
ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる*/

import java.util.Scanner;
import java.util.Random;

public class ComprehensiveBeginner02_01 {
    public static void main(String[] args) {

// "ゾロ目で大当たり！チャンスは30回"と表示させる
        System.out.println("ゾロ目で大当たり！ チャンスは30回");

// begin と入力してください> " と入力すると、開始するようにする
        System.out.print("begin と入力してください> ");
        Scanner sc = new Scanner(System.in);  /*sc = short of scanner */
        String ip = sc.nextLine();  /*ip = short of input */
        
        if (ip.equals("begin")) {

        for (int i = 1; i <= 30; i++)   {
            int slot01 = new Random().nextInt(9) + 1;
            int slot02 = new Random().nextInt(9) + 1;
            int slot03 = new Random().nextInt(9) + 1;
        
// ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
            System.out.println(i + "回目：" + slot01 + slot02 + slot03); /*1つ目のデータ型によって連結演算子か、算術演算子として解釈されるかが変わる */

// 大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
            if (slot01 == slot02 && slot02 == slot03) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                break;

// 30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
            } else if (i == 30) {
                System.out.println("残念でした。終わります。");
            }
        }

// "begin"以外の言葉が入力されと時に"合言葉はbeginです！スロットは回りません！"と表示させる
    } else {
            System.out.println("合言葉はbeginです！スロットは回りません！");
        }
    }
}