package vehicles;

import VehiclesRelatedInfo.PlateNumber;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
@DiscriminatorValue(value = "car")
public class Car extends Vehicle {

    @Basic
    private Integer seats;

    @OneToOne
    @JoinColumn(name = "plateNumber_id", referencedColumnName = "id")
    private PlateNumber plateNumber;

    public Car(){}

    public Car(String model, BigDecimal price, String fuelType, Integer seats) {
        super(model, price, fuelType);
        this.seats = seats;
    }

    public Car(String model, BigDecimal price, String fuelType, Integer seats, PlateNumber plateNumber) {
        this(model, price, fuelType, seats);
        this.plateNumber = plateNumber;
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

}
