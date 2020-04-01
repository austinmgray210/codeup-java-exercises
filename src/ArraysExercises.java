import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {


        // What happens when you run the following code? Why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//            // Arrays.toString() is important because without it, we would sysout the location in memory that array is stored.

        // Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] names = new Person[3];

        names[0] = new Person("Ka");
        names[1] = new Person("Kar");
        names[2] = new Person("Karl");

        for (Person person: names) {
            System.out.println(person.getName());
        }

            Person karla = new Person("karla");
            Person[] fourthPerson = addPerson(names, karla);

            for(Person person: fourthPerson) {
                System.out.println(person.getName());
            }
    }

    public static Person[] addPerson(Person[] names, Person person) {
        Person[] personCopy = Arrays.copyOf(names, names.length + 1);
        personCopy[personCopy.length - 1] = person;
        return personCopy;
    }

}
