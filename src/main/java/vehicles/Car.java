package vehicles;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
@DiscriminatorValue(value = "car")
public class Car extends Vehicle {

    @Basic
    private Integer seats;

    public Car(){}

    public Car(String model, BigDecimal price, String fuelType, Integer seats) {
        super(model, price, fuelType);
        this.seats = seats;
    }

    public Integer getSeats() {
        return this.seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }


}
