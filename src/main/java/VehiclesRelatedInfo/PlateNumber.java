package VehiclesRelatedInfo;

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
}
