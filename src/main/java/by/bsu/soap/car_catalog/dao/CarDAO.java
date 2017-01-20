package by.bsu.soap.car_catalog.dao;


import org.springframework.stereotype.Component;
import soap.bsu.by.carcatalog.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component
public class CarDAO {

	private static List<Car> cars;

	@PostConstruct
	public void initData()
	{
		cars = new ArrayList();
		Car car = new Car();
		car.setId(101);
		car.setModel("Toyota");
		car.setMark("Corolla");
		car.setPrice(14709.5);
		car.setYear("2016");
		cars.add(car);

		car = new Car();
		car.setId(102);
		car.setModel("Toyota");
		car.setMark("Camry");
		car.setPrice(21142);
		car.setYear("2016");
		cars.add(car);

		car = new Car();
		car.setId(103);
		car.setModel("Toyota");
		car.setMark("RAV4");
		car.setPrice(20148);
		car.setYear("2016");
		cars.add(car);

	}
	/**
	 * Get the list of cars
	 * @return list of cars
	 */
	public List<Car> list() {
		return cars;
	}

	/**
	 * Get car by Id if such exist, else retrieve null
	 * @param id
	 * @return car or null
	 */
	public Car get(int id) {

		for (Car c : cars) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	/**
	 * Get car by search criteria
	 * The conditions are strictly
	 * @param model, mark, year
	 * @return car
	 */
	public Car get(String model, String mark, String year) {
		for (Car c : cars) {
			if (c.getModel().equals(model) &&
					c.getMark().equals(mark) &&
					c.getYear().equals(year))
			{
				return c;
			}
		}
		return null;
	}

	/**
	 * Create car
	 * @param car
	 * @return created car
	 */
	public Car create(Car car) {
		car.setId(System.currentTimeMillis());
		cars.add(car);
		return car;
	}
}
