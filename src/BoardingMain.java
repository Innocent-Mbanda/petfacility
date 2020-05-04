/**
 * Handles boarding information for 3 boarding facilities
 *
 * @author Mikaila Williams
 * @version 1.0
 */

public class BoardingMain {
    public static void main(String[] args) {
        Dog bob;
        String[] allergies = {"bees", "cats"};
        bob = new Dog("Mastiff", 3, "Titus",
                allergies, 4, false, KennelSize.LARGE);


        bob.printDogInformation();
        System.out.println();
        bob.feedDog(3);
        System.out.println();
        bob.printDogInformation();
        System.out.println();
        bob.feedDog(1);
        System.out.println();
        bob.printDogInformation();
    }
}


