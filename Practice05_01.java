class Practice05_01 {
    public static void main(String[] args) {
        String[] arr_01;
        arr_01 = new String[4];

        arr_01[0] = "リンゴ";
        arr_01[1] = "バナナ";
        arr_01[2] = "メロン";
        arr_01[3] = "マスカット";

        System.out.println(arr_01[0]);
        System.out.println(arr_01[1]);
        System.out.println(arr_01[2]);
        System.out.println(arr_01[3]);

        int[] arr_02 = new int[4];

        arr_02[0] = 10;
        arr_02[1] = 20;
        arr_02[2] = 100;
        arr_02[3] = 3;

        System.out.println(arr_02[0]);
        System.out.println(arr_02[1]);
        System.out.println(arr_02[2]);
        System.out.println(arr_02[3]);

        String[][] arr_03;
        arr_03 = new String[3][2];

        arr_03[0][0] = "ポチ";
        arr_03[0][1] = "ジョン";
        arr_03[1][0] = "タマ";
        arr_03[1][1] = "もちまる";
        arr_03[2][0] = "ペンペン";
        arr_03[2][1] = "ペンギン丸";

        System.out.println(arr_03[0][0]);
        System.out.println(arr_03[0][1]);
        System.out.println(arr_03[1][0]);
        System.out.println(arr_03[1][1]);
        System.out.println(arr_03[2][0]);
        System.out.println(arr_03[2][1]);
    }
}