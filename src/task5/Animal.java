package task5;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", age: " + age + ", tail: " + tail +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Vaska", 10, true);
        Animal animal1 = new Animal("Vaska", 10, true);
        System.out.println("animal: " + animal.hashCode() + ", equals animal2: " + animal1.hashCode() + "   " + animal.equals(animal1));

    }
}
