import java.util.Scanner;

public class Space_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // コンソールから入力された数値を取得
        int space = scanner.nextInt();

        // 半角スペースを出力
        for (int i = 0; i < space; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
                System.out.print("*");
         }
        }
    }
}