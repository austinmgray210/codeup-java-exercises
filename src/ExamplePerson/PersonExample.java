package ExamplePerson;

// TODO:    Classes and Objects

// Here we define a class named Person with two instance variables, our properties, firstName and lastName. The class also defines an instance method, sayHello.
class Person {
    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }
    // Notice that in the sayHello method we can refer to firstName and lastName, despite them having variables with those names defined in the method. If we had defined a variable with the same name as a property, any references would refer to the variables, not the property.

    public static void main(String[] args) {
        Person rick = new Person();
        // Inside of the main method, we create an instance of our Person class. Notice that we are now able to define a variable with a type of Person. We use the new keyword, along with the name of the class, followed by an empty set of parenthesis to create the instance.

        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        // We then assign values to the object's firstName and lastName fields.

        System.out.println(rick.sayHello());
        // Then we call the sayHello method and print the message it returns.



        // TODO:    Static vs Instance

        // We said that fields can belong either to a class or an object. So far we've only seen examples of instance fields: fields that belong to an instance (as opposed to a class). What this means is that each object can have different values for their instance fields. For example, each person can have a different first name and last name.

        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        System.out.println(ada.sayHello());
        System.out.println(grace.sayHello());

        // In the above example, each instance of the Person class has a different value for each of the firstName and lastName properties, but they both have properties named firstName and lastName.

        // In contrast to instance fields are static fields, those that belong to a class as a whole. Static fields are accessible through the class itself. In other words, they are accessible without creating an instance of the class.


        // TODO:    Simple example of referencing a static field on a class:

        System.out.println(Math.PI);

        // Notice that we didn't need to write any code that instantiates the Match class, we simply add a . after the class name and refer to the static property.
        // Static fields are defined with the static keyword, and are shared by all instances of the class, meaning the static properties should not be anything that is supposed to be unique to instances of the class. Instead, they should contain information that all instances will use, or methods and properties that are meant to be accessed only statically. We'll take a look at examples of both cases.

    }
}