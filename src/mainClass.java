public class mainClass {
    public static void main(String[] args) throws Exception{
        //проверка clone
        Car car = new Car("audi", 10);
        Vehicle car2 = (Car)car.clone();

        VehicleStatic.printAllModelWithPrice(car);
        VehicleStatic.printAllModelWithPrice(car2);

        System.out.println(car.equals(car2) + " hashCode: " + (car.hashCode() == car2.hashCode())+"\n");

        car.setPriceByName("Name: 1", 6496.0);
        VehicleStatic.printAllModelWithPrice(car);
        VehicleStatic.printAllModelWithPrice(car2);

        System.out.println(car.equals(car2) + " hashCode: " + (car.hashCode() == car2.hashCode())+"\n");


        System.out.println("Motorbike");

        Motorbike bike = new Motorbike("bike", 4);
        Motorbike bike2 = (Motorbike)bike.clone();
        VehicleStatic.printAllModelWithPrice(bike);
        VehicleStatic.printAllModelWithPrice(bike2);

        System.out.println(bike.equals(bike2) + " hashCode: " + (bike.hashCode() != bike2.hashCode())+"\n");

        bike.setPriceByName("Name: 1", 8009.0);
        VehicleStatic.printAllModelWithPrice(bike);
        VehicleStatic.printAllModelWithPrice(bike2);

        System.out.println(bike.equals(bike2) + " hashCode: " + (bike.hashCode() != bike2.hashCode())+"\n");

        System.out.println(car.toString());
        System.out.println(bike.toString());
    }
}
