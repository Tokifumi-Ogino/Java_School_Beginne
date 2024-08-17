public class Practice10_01 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "pochi";
        System.out.println(animal1.name);
        animal1.type = "dog";
        animal1.cryAnimals();
        

        Animal animal2 = new Animal();
        animal2.name = "tama";
        System.out.println(animal2.name);
        animal2.type = "cat";
        animal2.cryAnimals();
       
    }
}


class Animal {
    String name = "John";
    String type = "nothing";

    public void cryAnimals() {
        System.out.println(
            switch (type) {
                case "cat" -> "nya-";
                case "dog" -> "wan";
                default -> "特定できませんでした";
            }
        );

    }
}
