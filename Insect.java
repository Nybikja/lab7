package com.company;

public class Insect {
    private String name;
    private int speed;
    private int weight;
    private String color;
    private String type;
    private String size;
    private int lifetime;
    private static int counter;

    public Insect(String name, int speed, int weight, String color, String type, String size, int lifetime){
        setValues(name, speed, weight, color, type, size, lifetime);
        counter++;
    }

    public Insect(String name, int speed, int weight, String color) {
        this(name, speed, weight, color, null, null, 0);
    }

    public Insect(){
        this(null, 0, 0, null);
    }

    private void setValues(String name, int speed, int weight, String color, String type, String size, int lifetime){
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.type = type;
        this.size = size;
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "Insect { \n"
                + "Name: " + name + '\n'
                + "speed: " + speed + '\n'
                + "weight: " + weight + '\n'
                + "color: " + color + '\n'
                + "type: " + type + '\n'
                + "size: " + size + '\n'
                + "lifetime: " + lifetime + '\n'
                + "}\n";
    }

    public static void printStaticCounter(){
        System.out.println(Insect.counter);
    }

    public void printCounter(){
        System.out.println(Insect.counter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
}
