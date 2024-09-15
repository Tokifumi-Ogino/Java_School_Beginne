// class Practice08_02 {
//     public static void main(String[] args) {
//         int arr[][] = {{0, 1, 2}, {3, 4, 5}};

//         for (int i = 0; i <= 2; i++) {
//             for (int j = 0; j <= 2; j++) {
//                 System.out.println(arr[i][j]);
//             }
//         }   
//     }
// }

// class Practice08_02 {
    // public static void main(String[] args) {
    //     int arr01[] = {0, 1, 2};
    //     int arr02[] = {3, 4, 5};

    //     for (int i = 0; i <= 2; i++) {
            // System.out.println(arr01[i]);
            // }
        // for (int i = 0; i <= 2; i++) {
            // System.out.println(arr02[i]);
            // }
        // }   
    // }

class Practice08_02 {
    public static void main(String[] args) {
        int arr[][] = {
            {0, 1, 2},
            {3, 4, 5}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}