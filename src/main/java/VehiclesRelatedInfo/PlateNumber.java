package VehiclesRelatedInfo;

import vehicles.Car;
import vehicles.Vehicle;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "plate_numbers")
public class PlateNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Basic
    private String number;

    @OneToOne(mappedBy = "plateNumber", targetEntity = Car.class)
    private Vehicle car;

    public PlateNumber(){}

    public PlateNumber (String number) {
        this.number = number;
    }

    public BigInteger getId() {
        return this.id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Vehicle getCar() {
        return car;
    }
}
