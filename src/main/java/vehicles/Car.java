package vehicles;

import VehiclesRelatedInfo.Driver;
import VehiclesRelatedInfo.PlateNumber;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cars")
@DiscriminatorValue(value = "car")
public class Car extends Vehicle {

    @Basic
    private Integer seats;

    @OneToOne
    @JoinColumn(name = "plateNumber_id", referencedColumnName = "id")
    private PlateNumber plateNumber;

    @ManyToMany(mappedBy = "carsList", targetEntity = Driver.class)
    private List<Driver> driver;

    public Car(){}

    public Car(String model, BigDecimal price, String fuelType, Integer seats) {
        super(model, price, fuelType);
        this.seats = seats;
        this.driver = new ArrayList<>();
    }

    public Car(String model, BigDecimal price, String fuelType, Integer seats, PlateNumber plateNumber, Driver... driver) {
        this(model, price, fuelType, seats);
        this.plateNumber = plateNumber;
        this.driver = List.of(driver);
    }

    public Integer getSeats() {
        return this.seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public PlateNumber getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(PlateNumber plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setDriver(List<Driver> driver) {
        this.driver = driver;
    }

    public List<Driver> getDriver() {
        return driver;
    }
}
