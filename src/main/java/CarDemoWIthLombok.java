

public class CarDemoWIthLombok {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok("BMW", 2022);

        CarWithLombok car2 = new CarWithLombok();
        car2.setBrand("Mercedes");
        car2.setYear(2024);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Brand of first car: " + car1.getBrand());
    }
}