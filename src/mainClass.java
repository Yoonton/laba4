public class mainClass {
    public static void main(String[] args) throws Exception{
        //проверка clone
        Car car = new Car("audi", 10);
        Vehicle car2 = (Car)car.clone();
        VehicleStatic.printAllModelWithPrice(car);
        VehicleStatic.printAllModelWithPrice(car2);
        car.setPriceByName("Name: 1", 6496.0);
        VehicleStatic.printAllModelWithPrice(car);
        VehicleStatic.printAllModelWithPrice(car2);

        Motorbike bike = new Motorbike("bike", 4);
        VehicleStatic.printAllModelWithPrice(bike);


        System.out.println(car.toString());
        System.out.println(bike.toString());
    }
}
