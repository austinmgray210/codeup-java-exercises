package ExampleThisKeyword;

// The this keyword provides us a way to refer to the current instance. You can this as saying "this object". You can only use the this keyword inside of an instance method, as it is an error to do so elsewhere.

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String sayHello() {
        return String.format("%s says hello!", this.name);
    }
    // As you can see in the example above, in the constructor, the this keyword lets us unambiguously refer to the name property of the Person object that is being created, even though we already have a variable named in scope.

    // The this keyword can also be used to call other constructors. Let's illustrate this by rewriting our Student class constructors from earlier.
}


class Student {
    public String name;
    public String cohort;

    public Student(String name) {
        this(name, "Unassigned");
    }

    public Student(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }

    public String sayHello() {
        return "Hello from " + this.name + "!";
    }
    // Now, in the single argument constructor, instead of duplicating the code to assign to the object's properties, we call the constructor that already had this code defined. While this example is fairly small, it demonstrates how we can avoid duplication of code with multiple constructors.
}


