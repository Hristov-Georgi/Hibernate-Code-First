package vehicles;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "trucks")
@DiscriminatorValue(value = "truck")
public class Truck extends Vehicle {

    @Basic
    private Double loadCapacity;

    public Truck (){}

    public Truck (String model, BigDecimal price, String fuelType, Double loadCapacity) {
        super(model, price, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public Double getLoadCapacity() {
        return this.loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
