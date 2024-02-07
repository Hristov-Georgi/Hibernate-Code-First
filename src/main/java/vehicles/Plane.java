package vehicles;

import VehiclesRelatedInfo.Company;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "planes")
@DiscriminatorValue(value = "plane")
public class Plane extends Vehicle {

    @Basic
    private Integer passengerCapacity;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    public Plane (){}

    public Plane (String model, BigDecimal price, String fuelType, Integer passengerCapacity) {
        super(model, price, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    public Plane (String model, BigDecimal price, String fuelType, Integer passengerCapacity, Company company) {
        this(model, price, fuelType, passengerCapacity);
        this.company = company;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }
}
