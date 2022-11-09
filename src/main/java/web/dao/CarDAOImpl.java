package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {

    private List<Car> listCars;
    {
        listCars =  new ArrayList<>();
        listCars.add(new Car("BMW", "M", 5));
        listCars.add(new Car("KIA", "RIO", 2018));
        listCars.add(new Car("Mercedes", "GL", 400));
        listCars.add(new Car("Toyota", "Land Cruiser", 200));
        listCars.add(new Car("Mazda", "CX", 5));
    }

    @Override
    public List<Car> getCarList(int count) {
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
