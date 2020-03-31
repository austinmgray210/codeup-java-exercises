package ExampleStaticVsInstance;

class Person {
    public static long worldPopulation = 7_500_000_000L; // Class property
    public String name;

    public static void main(String[] args) {
        Person theBestDrummerAlive = new Person();
        theBestDrummerAlive.name = "Niel Peart";

        Person.worldPopulation += 1; // Accessing a static property

        System.out.println(Person.worldPopulation); // Prints 7_500_000_001

        // technically this will work, but it is usually better to reference static properties through the class, not the instances.
        System.out.println(theBestDrummerAlive.worldPopulation); // Prints 7_500_000_001

        // DO NOT DO THIS, it will not compile
        // System.out.println(Person.name);


        // Each person has a different name, but the world population is the same for all people.
        // You cannot access an instance variable in a static context (only individual people have names, not people in general).
    }
}
