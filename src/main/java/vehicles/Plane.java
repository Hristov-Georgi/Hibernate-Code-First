package vehicles;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "planes")
@DiscriminatorValue(value = "plane")
public class Plane extends Vehicle {

    @Basic
    private Integer passengerCapacity;

    public Plane (){}

    public Plane (String model, BigDecimal price, String fuelType, Integer passengerCapacity) {
        super(model, price, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
