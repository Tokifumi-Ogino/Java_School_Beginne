 /*九九の表を、2重の繰り返し(2重for文)を使って表示するプログラムを作成してください。
    2重の繰り返しを使わず単に表示するのは NG*/
    
public class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {

        

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int sum = i * j;

                System.out.print(sum);
                System.out.print(" ");
            }
                System.out.println();
        }
    }
}
