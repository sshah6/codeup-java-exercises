public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Alex"); //The private does not apply when you first assigna value to it. it applies when changing it
        p.sayHello();
        p.setName("Oh"); // here we gotta go through setter
        p.sayHello();

        //(1) test
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
