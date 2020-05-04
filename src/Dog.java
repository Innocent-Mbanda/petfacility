/**
 * Describes the dog that is being borded.
 * Has breed, kennel type, age, allergies, how much food they need, and whether or not they've been fed
 *
 * @author Mikaila Williams
 * @version 1.0
 */

public class Dog {

    private String breed;
    private int age;
    private String name;
    private String[] allergies;
    private int amountOfFood; //in cups
    private int amountFed; //amount of food given to dog today
    private boolean isFed;
    private KennelSize kennelSize;

    public Dog(){
        this.allergies = new String[0];
    }

    public Dog(String breed, int age, String name, String[] allergies,
               int amountOfFood, boolean isFed, KennelSize kennelSize){
        this.breed = breed;
        this.age = age;
        this.name = name;
        this.allergies = allergies;
        this.amountOfFood = amountOfFood;
        this.isFed = isFed;
        this.kennelSize = kennelSize;
        this.amountFed = 0;
    }

    public void printDogInformation() {
        System.out.println(name + "'s breed is " + breed);
        System.out.println(name + "'s age is " + age);
        if (allergies.length > 0) {
            System.out.println(name + "'s allergies are: ");

            for (int i = 0; i < allergies.length; i++){
                System.out.println(allergies[i]);
            }
        } else {
            System.out.println(name + " does not have any allergies.");
        }
        if (isFed) {
            System.out.println(name + " has been fed " + amountFed + " cups of food.");
        } else {
            System.out.println(name + " is hungry!");
        }
        System.out.println(name + " is in kennel size " + kennelSize);
    }

    public void feedDog(int amountOfFood) {
        if (isFed) {
            System.out.println(name + " has already been fed");
        } else {
            System.out.println(name + " has been given " + amountOfFood + " cups of food");
            amountFed = amountFed + amountOfFood;
            if (amountFed >= this.amountOfFood) {
                isFed = true;
            }
        }
    }
}

