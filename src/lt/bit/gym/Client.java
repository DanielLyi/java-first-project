package lt.bit.gym;

public abstract class Client extends Object implements Connector {

    private int ID;
    private String name;
    private double height;
    private double weight;

    public Client(int ID, String name, double height, double weight) {
        this.ID = ID;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double countBMI() {
            double BMI = (100*100*this.weight)/(this.height*this.height);
            return BMI;
    }
}
