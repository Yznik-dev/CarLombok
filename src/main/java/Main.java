public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Civic", "Honda", 2022,
                25000.0, "Black", 5);
        Car car2 = new Car("GLE", "Mercedes", 2020, 350000, "white", 5);


        System.out.println(car1);
        car1.setPrice(30000);
        System.out.println(car1.getPrice());

        System.out.println("Are these objects equal? " + car1.equals(car2));

        System.out.println("The HashCode of this object is: " + car1.hashCode());
        System.out.println("The HashCode of this object is: " + car2.hashCode());

    }
}
