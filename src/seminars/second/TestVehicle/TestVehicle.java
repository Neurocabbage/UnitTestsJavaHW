package seminars.second.TestVehicle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import seminars.second.Vehicle.Car;
import seminars.second.Vehicle.Motorcycle;
import seminars.second.Vehicle.Vehicle;

public class TestVehicle {

    Car car = new Car("Toyota", "Camry", 2022);
    Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);

    @Test
    public void carInstanceOfVehicle() {
        Assertions.assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void carHasFourWheels() {
            Assertions.assertEquals(4, car.getNumWheels());
            }

    @Test
    public void motorcycleHasTwoWheels() {
            Assertions.assertEquals(2, motorcycle.getNumWheels());
            }

    @Test
    public void carTestDriveSpeed() {
            car.testDrive();
            Assertions.assertEquals(60, car.getSpeed());
            }

    @Test
    public void motorcycleTestDriveSpeed() {
            motorcycle.testDrive();
            Assertions.assertEquals(75, motorcycle.getSpeed());
            }

    @Test
    public void carParkSpeed() {
            car.testDrive();
            car.park();
            Assertions.assertEquals(0, car.getSpeed());
            }

    @Test
    public void motorcycleParkSpeed() {
            motorcycle.testDrive();
            motorcycle.park();
            Assertions.assertEquals(0, motorcycle.getSpeed());
            }


}
