package ExampleVisibility;

// Visibility refers to how a class or instance field is allowed to be accessed. It allows us to encapsulate the data in our classes; that is, only exposed what is necessary to other classes and objects.

// This far, we have used the public keyword for all of our fields. The public keyword means that the field is accessible from anywhere. The next visibility keyword we'll introduce is private. When a field is defined as private, it is only accessible within the class that defines it.

// A common pattern in Java is to define classes with private properties, and create methods to allow access to those properties.

class Student {
    public String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double shareGrade() {
        return grade;
    }
}
    // Here the grade property is defined as private, but we've also created a method to allow us to access to (but not re-assigning) the property named shareGrade.


// The code below uses the Student class we've just defined:

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 82.4);

        System.out.println(student.name);
            // Prints "John Doe"

        // DON'T DO THIS - Private properties can't be accessed outside the class
        //        System.out.println(student.grade);

        // DO THIS INSTEAD
        System.out.println(student.shareGrade());
    }
}

// Notice that accessing a private property of an object outside of the class that defines the object will result in a compile time error.