public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "GLA", 2020, 1000, 40);
        Truck truck = new Truck("Mazda", "F-130", 2019, 700, 50, 3);

        System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles/gallon");
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " miles/gallon");
    }
}