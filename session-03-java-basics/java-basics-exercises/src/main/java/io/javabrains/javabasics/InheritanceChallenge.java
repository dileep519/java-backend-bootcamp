package io.javabrains.javabasics;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */

class Animal {
    public String name;
    public Integer age;

    public Animal(String newName, Integer newAge) {
        name = newName;
        age =  newAge;
    }

    public void makeSound() {
        System.out.println("Animal barked");
    }
}

class Dog extends Animal {
    private String breed;
    public Dog(String newName, Integer newAge, String newBreed) {
        super(newName, newAge);
        breed=newBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    private Integer lives;
    public Cat(String newName, Integer newAge, Integer newLives) {
        super(newName, newAge);
        lives=newLives;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class InheritanceChallenge {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Animal("Lion", 5);
        animals[1] = new Dog("Buddy", 3, "Golden Retriever");
        animals[2] = new Cat("Whiskers", 2, 9);
        animals[3] = new Animal("Elephant", 10);

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);
            animal.makeSound();
            System.out.println();
        }
    }
}
