package OOPBasicsZoo;

public class Zoo {

    public static void main(String[] args) {

//        Animal a1 = new Animal(17, "M", 32);
//        a1.eat();
//        a1.sleep();
//
//        Bird b1 = new Bird(10, "F", 2);
//        b1.eat();
//        b1.sleep();
//        b1.fly();
//
//        Fish f1 = new Fish(3, "M", 1);
//        f1.swim();

//        Chicken c1 = new Chicken(3, "F", 4);

//            Animal s1 = new Sparrow(1, "F", 2);
//            s1.move();
//
//            Animal f1 = new Fish(1, "F", 2);
//            f1.move();
//
//            moveAnimal(f1);
//
//            moveAnimal(s1);

            Flyable flyingBird = new Sparrow(1, "M", 2);

//            Flyable flyingBird2 = new Bird(1, "F", 3);
//             flyingBird2 throws an error because the class Bird does NOT implement the flyable interface


    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }



}








