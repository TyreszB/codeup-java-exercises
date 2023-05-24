import java.util.Arrays;

public class ArraysExercises {

    public static class Person {
        private String name;

        public Person(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }




        }
    public static void main(String[] args){
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person[] people = new Person[3];

        people[0] = new Person("Tyresz");
        people[1] = new Person("Bob");
        people[2] = new Person("Megumi");
//        for (Person person : people) {
//            System.out.println(person.getName());
//        }


        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        Person newPerson = new Person("Dave");
        newPeople[newPeople.length - 1] = newPerson;
        for(Person person: newPeople){
            System.out.println(person.name);
        }

    }

}
