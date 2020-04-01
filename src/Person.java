public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    //returns the person's name
    public String getName() {
        return this.name;
    }

    //returns the person's name
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello! I'm %s.", getName());
    }


    public static void main(String[] args) {

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//            // True because .equals is comparing strings
//
//        System.out.println(person1 == person2);
//            // False because == is comparing memory location
//

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//            // True because it's assigning the value in memory to person 2

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//           //Prints:
//                //John
//                //John
//
//        // Sets person2's name to Jane, but since person2 is equal to person1 in memory it changes both person2 and person1's name to "Jane"
//        person2.setName("Jane");
//
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//          //Prints:
//                //Jane
//                //Jane

    }


}
