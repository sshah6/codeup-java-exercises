import java.util.Arrays;

public class ArraysExercises {
//A static method that takes in an array and outputs an array after adding an element to it.

    public static Person[] addPerson(Person[] people, Person person){
        Person[] morePersons = new Person[people.length + 1];
        for(int i = 0; i < people.length; i++){
            morePersons[i] = people[i];
        }
        morePersons[morePersons.length - 1] = person;
        people = morePersons;
    return people;
    };

    public static void main(String[] args) {
        //(1)
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));//We use this because it prvents us to loop through and get the elements one by one.

        Person[] persons = new Person[3];

        persons[0] = new Person("Alex");
        persons[1] = new Person("Alan");
        persons[2] = new Person("Alexi");

        for(Person person: persons){
            System.out.println(person.getName()); //we cannot just print object in java, or maybe the elements are private
        }


    Person p1 = new Person("The forth");//Creating an object to add to array
    Person[] theAddedArr = addPerson(persons, p1);//implementing addition and put it in an array

    for(Person person: theAddedArr){
        System.out.println(person.getName());
    }

    }
}
