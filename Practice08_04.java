/*class Practice08_04 {
     public static void main(String[] args) {

         int total = 0;

         for (int i = □; i <= □; □) {
             total += □;
         }
         System.out.println("1～10の合計は" + □ + "です。");
     }
}*/

class Practice08_04 {
    public static void main(String[] args) {

        int total = 0;
        int i = 1;

        while (i < 11) {
            total += i;
            i++;
        }
        System.out.println("1～10の合計は" + total + "です。");
    }
}