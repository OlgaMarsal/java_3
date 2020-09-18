package lesson_one_java_three;

public abstract class Fruit {
    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}