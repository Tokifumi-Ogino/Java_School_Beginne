/* 整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        System.out.println("整数を入力してください");
        // Scannerクラスをインスタンス化
        Scanner sc = new Scanner(System.in);

        System.out.print("数値１：");
        int num01 = sc.nextInt();

        System.out.print("数値２：");
        int num02 = sc.nextInt();

        System.out.print("数値３：");
        int num03 = sc.nextInt();

        if (num01 <= num02 && num02 <= num03) {
            System.out.println("OK");
        /*} else if (num01 == num02 && num02 == num03) {
            System.out.println("OK");*/
        } else {
            System.out.println("NG");
        }
    }
}