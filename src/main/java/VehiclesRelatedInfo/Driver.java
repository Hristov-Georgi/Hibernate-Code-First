package VehiclesRelatedInfo;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Column(name = "full_name")
    private String fullName;

    public Driver(){}

    public Driver(String fullName) {
        this.fullName = fullName;
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
}
