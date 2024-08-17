public class Ant0902 {
    public static void main(String[] args) {
        greet("朝");
        greet("昼");
        greet("い");
    }

    public static void greet(String greets) {
        if (greets == "朝") {
            System.out.println("Good morning!!");
        } else if (greets == "昼") {
            System.out.println("Good afternoon!!");
        } else if (greets == "夜") {
            System.out.println("Good evening!!");
        } else {
            System.out.println("Hello!");
        }
    }
}