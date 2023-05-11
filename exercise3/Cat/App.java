package Cat;
public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myPet = new Pet();

        myPet.meow();
        System.out.println(myPet.fur);
        System.out.println(myPet.mouth);
        System.out.println(myPet.eyes);
        System.out.println(myPet.ear);

    }
}