public abstract class Vehicle {
    protected String mark;
    protected String model;
    protected int year;

    public Vehicle(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public abstract double calculateFuelEfficiency();
}