package cat;

public class Cat {
    private String name;
    private String breeds;
    private double weight;

    void claw() {
        System.out.println("할퀴기!!");
    }

    void meow() {
        System.out.println("야옹");
    }

    public String getName() {
        return name;
    }

    public String getBreeds() {
        return breeds;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

