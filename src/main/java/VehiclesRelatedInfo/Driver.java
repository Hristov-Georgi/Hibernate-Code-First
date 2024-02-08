package VehiclesRelatedInfo;

import vehicles.Car;
import vehicles.Vehicle;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Column(name = "full_name")
    private String fullName;

    @ManyToMany
    @JoinTable(name = "drivers_cars",
            joinColumns = @JoinColumn(name = "driver_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "car_id", referencedColumnName = "id")
    )
    private List<Vehicle> carsList;

    public Driver(){}

    public Driver(String fullName, Vehicle... car) {
        this.fullName = fullName;
        this.carsList = List.of(car);
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BigInteger getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setCarsList(List<Vehicle> carsList) {
        this.carsList = carsList;
    }

    public List<Vehicle> getCarsList() {
        return carsList;
    }
}
