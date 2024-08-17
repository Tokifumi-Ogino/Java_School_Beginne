/*2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。*/

import java.util.Scanner;

public class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        // 画面に"係数a b cを入力してください"と出力し改行する
        System.out.println("係数a, b, cを入力してください");

        // キーボードから３つの実数を入力し、それぞれ変数 a b cにセットする
        // Scannerクラスをインスタンス化 (ce = coefficient)
        Scanner ce = new Scanner(System.in);

        System.out.print("係数a：");
        int a = ce.nextInt();

        System.out.print("係数b：");
        int b = ce.nextInt();

        System.out.print("係数c：");
        int c = ce.nextInt();

        // ２次方程式の解を判別し、判別結果をコンソールに表示する
        int d = b * b - 4 * a * c;

        if (d > 0) {
        System.out.println("解は２つの実数解です");

        } else if (d == 0) {
        System.out.println("解は重解です");

        } else {
        System.out.println("解は２つの虚数解です");
        }
    }
}
