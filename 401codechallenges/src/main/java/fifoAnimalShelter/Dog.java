package fifoAnimalShelter;

public class Dog extends Animal {
    private String type = "dog";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public Dog(String type){
        this.type = type;
    }
}
