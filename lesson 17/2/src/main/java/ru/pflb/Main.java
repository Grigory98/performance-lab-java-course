package ru.pflb;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;
import ru.pflb.vehicles.Lorry;
import ru.pflb.vehicles.SportCar;
import ru.pflb.vehicles.Car;
import ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        var lorry = new Lorry(
                "Volvo",
                VehicleClass.LARGE,
                1000,
                5000,
                new Engine(220, "VolvoProduction"),
                new Driver("Jan Klod Vandam", 62, 30, 222222)
        );
        var sportCar = new SportCar(
                "Audi",
                600,
                800,
                new Engine(220, "AudiEngine"),
                new Driver("Michael Schumacher", 54, 54, 111111)
        );
        var car = new Car(
                "Tesla",
                VehicleClass.LUXURY,
                1000,
                new Engine(220, "Tesla"),
                new Driver("Name Surname", 25, 5, 12345)
        );

        System.out.println(lorry.toString());
        System.out.println(sportCar.toString());
        System.out.println(car.toString());
    }
}
