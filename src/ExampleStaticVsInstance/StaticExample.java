package ExampleStaticVsInstance;


// Static properties can be referenced by instance methods. But instance properties CANNOT be referenced in a static tontext.

class Arithmetic {

    // Static property
    public static double pi = 3.14159;

    // Static methods
    public static int add(int x, int y) {
        return x + y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }

}
class MathTest {
    public static void main(String[] args) {
        System.out.println(Arithmetic.pi);
            // Prints 3.14159

        System.out.println(Arithmetic.add(5, 5));
            // Prints 10

        System.out.println(Arithmetic.multiply(5, 5));
            // Prints 25
    }
}

// In the example above, the Arithmetic class is only meant to be referenced statically, meaning we never create instances of it; we just refer to the methods and properties through the class name.



