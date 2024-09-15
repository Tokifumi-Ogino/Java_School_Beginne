import java.util.Random;

class Practice07_05 {
    public static void main(String[] args) {
    // 1 ~ 3 のランダムな 変数 man, woman, child を宣言
        int man = new Random().nextInt(3) + 1;
            System.out.println("man = " + man);
        int woman = new Random().nextInt(3) + 1;
            System.out.println("woman = " + woman);
        int child = new Random().nextInt(3) + 1;
            System.out.println("child = " + child);

        // 勝者判定
        if (man != woman && woman != child && man != child) {
            System.out.println("あいこです");
        } else if (man == woman && woman == child && man == child) {
            System.out.println("あいこです");

        } else if (man == 1 && woman == 1) {
            if (child == 2) {
                System.out.println("childが勝ちました");
        } else if (child == 3) {
                System.out.println("manとwomanが勝ちました");
        }

        } else if (man == 1 && woman == 2) {
            if (child == 1) {
                System.out.println("womanが勝ちました");
        } else if (child == 2) {
                System.out.println("womanとchildが勝ちました");
        }

        } else if (man == 1 && woman == 3) {
            if (child == 1) {
                System.out.println("manとchildが勝ちました");
        } else if (child ==3) {
                System.out.println("manが勝ちました");
        }

        } else if (man == 2 && woman == 1) {
            if (child == 1) {
                System.out.println("manが勝ちました");
        } else if (child == 2) {
                System.out.println("manとchildが勝ちました");
        }

        } else if (man == 2 && woman == 2) {
            if (child == 1) {
                System.out.println("manとwomanが勝ちました");
        } else if (child == 3) {
                System.out.println("childが勝ちました");
        }

        } else if (man == 2 && woman == 3) {
            if (child == 2) {
                System.out.println("womanが勝ちました");
        } else if (child == 3) {
                System.out.println("womanとchildが勝ちました");
        }

        } else if (man == 3 && woman == 1) {
            if (child == 1) {
                System.out.println("womanとchildが勝ちました");
        } else if (child == 3) {
                System.out.println("womanが勝ちました");
        }

        } else if (man == 3 && woman == 2) {
            if (child == 2) {
                System.out.println("manが勝ちました");
        } else if (child == 3) {
                System.out.println("manとchildが勝ちました");
        }

        } else if (man ==3 && woman == 3) {
            if (child == 1) {
                System.out.println("childが勝ちました");
        } else if (child == 2) {
                System.out.println("manとwomanが勝ちました");
        }
        } else {
            System.out.println("あいこです");
        }
        }
    }