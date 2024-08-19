package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Date lastModified;

    public Person(String newFirstName, String newLastName, int newAge, Date modifiedDate) {
        firstName = newFirstName;
        lastName = newLastName;
        age  = newAge;
        lastModified = modifiedDate;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person newPerson = (Person) obj;
        return Objects.equals(firstName, newPerson.firstName)
                && Objects.equals(lastName, newPerson.lastName)
                && age == newPerson.age;
    }

    public int hashCode() {
        System.out.println(firstName + lastName + age + lastModified);
        return Objects.hash(firstName, lastName, age);
    }
}

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Person p1 = new Person("Tester", "one", 23, new Date());
        Person p2 = new Person("Tester", "one", 23, new Date());
        System.out.println("Are both equal " + p1.equals(p2) + " Hash code of obj1 " + p1.hashCode() + " Hash code of obj2 " + p2.hashCode());
        
    }
}
