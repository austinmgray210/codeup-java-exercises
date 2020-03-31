package ExampleConstructors;

// A constructor is a special method that is called when an object is created. A constructor has the same name as the class and does not defire a return type. Constructors, like any other method, can accept arguments and be overloaded.

class Person {
    public String name;

    // The Person constructor
    public Person() {
        System.out.println("A person is being created!");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
    }

    // The above code will print out:
    //      A Person is being created!
    //      A Person is being created!
    // because the constructor is called whenever we use the new keyword to create an instance of the class.
}


// A common use case for constructors is to set, or provide default values for an object's properties:

class Student {
    public String name;
    public String cohort;


    // CONSTRUCTORS //

    public Student(String studentName) {
        name = studentName;
        cohort = "Unassigned";
    }
    // The first constructor accepts the student's name and sets the value of the name property based on what is passed to it. It also sets the value of the cohort property to the string Unassigned.

    public Student(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }
    // The second constructor allows us to specify values for both the student's name and the cohort when the object is created.

    // END CONSTRUCTORS //

    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Student A");
        Student s2 = new Student("Student B", "Voyagers");
        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());
    }
    // Here we see an example of an overloaded constructor; there are two definitions that differ in parameter count.

}