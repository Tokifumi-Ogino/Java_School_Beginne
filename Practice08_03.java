import java.util.Random;

class Practice08_03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int num = new Random().nextInt(6) + 1;
            System.out.println(num);

            if (num % 2 != 0 ) {
                System.out.println(i + "回目、" + num + "が出ました");
            }
        }
    }
}
