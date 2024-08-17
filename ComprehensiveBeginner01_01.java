// 整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成してください。
public class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        System.out.println("整数値を入力してください。");
        int inputNum = new java.util.Scanner(System.in).nextInt();

        if (inputNum %2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    
}
