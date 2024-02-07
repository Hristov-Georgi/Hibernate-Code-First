import VehiclesRelatedInfo.Company;
import VehiclesRelatedInfo.PlateNumber;
import vehicles.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("PU_name");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        PlateNumber carPlateNumber2 = new PlateNumber("JJJJ3030KK");
        PlateNumber carPlateNumber1 = new PlateNumber("LLLLL3030KK");

        entityManager.persist(carPlateNumber2);
        entityManager.persist(carPlateNumber1);

        Company company = new Company("Blue Airline");

        entityManager.persist(company);

        Vehicle plane1 =
                new Plane("A-130", new BigDecimal("140000"), "Jet", 200, company);

        entityManager.persist(plane1);

        Vehicle car =
               new Car("golf", new BigDecimal("14000"), "gasoline",5, carPlateNumber2);

        Vehicle bike =
                new Bike("puma", new BigDecimal("1400.87"), "no Fuel");

        Vehicle car2 =
                new Car("golf", new BigDecimal("14000"), "gasoline",5);

        Vehicle plane =
                new Plane("A-130", new BigDecimal("140000"), "Jet",  200);

        Vehicle truck =
                new Truck("volvo", new BigDecimal("50000"), "diesel", 20000.56);

        Vehicle car3 =
                new Car("golf", new BigDecimal("14000"), "gasoline",5, carPlateNumber1);

        entityManager.persist(bike);
        entityManager.persist(car);
        entityManager.persist(car2);
        entityManager.persist(car3);
        entityManager.persist(plane);
        entityManager.persist(truck);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
