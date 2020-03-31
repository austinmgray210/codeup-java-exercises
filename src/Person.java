public class Person {
    private String name;

    // Person constructor
    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name.
    public void sayHello() {
        System.out.printf("Hello, I'm %s!\n", name);
    }

    // The class should have a constructor that accepts a String value and sets the person's name to the passed string.

    // Create a main method on the class that creates a new Person object and tests the above methods.
    public static void main(String[] args) {

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // True
//        System.out.println(person1 == person2); // false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // True

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John

        person2.setName("Jane");

        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane

    }

}

