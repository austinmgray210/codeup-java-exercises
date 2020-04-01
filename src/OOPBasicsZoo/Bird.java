package OOPBasicsZoo;

public class Bird extends Animal {

    // When we extend a class, the default constructor won't work anymore because there's a conflict between the way an animal is created and the way a bird is created.
    // All animals require the specific parameters.

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("The bird is flapping its wings...");
    }
    // the keyword super is calling the super classes constructor to create a bird object.



}
