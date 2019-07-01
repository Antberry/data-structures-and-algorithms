package fifoAnimalShelter;

public class Cat extends Animal {
    private String type = "cat";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public Cat(String type){
        this.type = type;
    }
}
