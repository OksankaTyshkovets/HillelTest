package com.hillel.lesson10.classwork;

public class Eagle extends Bird implements AttackBehavior, EatBehavior {

    private String name;


    public Eagle(String animalType, String name) {
        super(animalType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " start to fly");
    }

    @Override
    public void move() {
        System.out.println(name + " start to move");
    }

    @Override
    public void attack(Animal animal) {
        System.out.println(name.concat("  start attack ").concat(animal.getAnimalType()));
    }

    @Override
    public void eat() {
        System.out.println(name.concat("  start eat"));
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }
}
