package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 5, "Black"));
        cars.add(new Car("Audi", 6, "White"));
        cars.add(new Car("Mercedes", 3, "Silver"));
        cars.add(new Car("Tesla", 3, "Red"));
        cars.add(new Car("Toyota", 7, "Blue"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
