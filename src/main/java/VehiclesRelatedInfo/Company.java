package VehiclesRelatedInfo;

import vehicles.Plane;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;

    @Column(name = "company_name")
    private String name;

    public Company(){}

    public Company(String name) {
        this.name = name;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
