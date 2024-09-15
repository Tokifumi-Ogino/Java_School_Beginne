class Practice08_01 {
    public static void main(String[] args) {
        
        int arr[] = {2, 4, 6, 8, 10};

        for (int i = 0; i <= 4; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(arr[i]);
        }
        
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            if (i == 4) {
                continue;
            }
                sum += arr[i];
        }
        System.out.println(sum);
        }
    }