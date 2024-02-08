import VehiclesRelatedInfo.Company;
import VehiclesRelatedInfo.Driver;
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

        PlateNumber plateNumber3 = new PlateNumber("JJJJAJDAD");
        PlateNumber plateNumber1 = new PlateNumber("LLAASSA");

        entityManager.persist(plateNumber3);
        entityManager.persist(plateNumber1);



        Vehicle car = new Car("BMV", BigDecimal.valueOf(134444), "gasoline",
                6, plateNumber1);

        entityManager.persist(car);

        Driver driver = new Driver("Kiril Kirilov");
        Driver driver1 = new Driver("Rudolf Ruddling");
        entityManager.persist(driver);
        entityManager.persist(driver1);

        Company company = new Company("Blue Airline");

        entityManager.persist(company);

        Vehicle plane1 =
                new Plane("A-130", new BigDecimal("140000"), "Jet", 200, company);

        entityManager.persist(plane1);

        Vehicle bike =
                new Bike("puma", new BigDecimal("1400.87"), "no Fuel");

        Vehicle car2 =
                new Car("a3", new BigDecimal("14000"), "gasoline",5);

        entityManager.persist(car2);

        Driver driver2 = new Driver("Tinko Tinko", car2);
        entityManager.persist(driver2);

        Vehicle plane =
                new Plane("A-130", new BigDecimal("140000"), "Jet",  200);

        Vehicle truck =
                new Truck("volvo", new BigDecimal("50000"), "diesel", 20000.56);


        entityManager.persist(bike);

        entityManager.persist(plane);
        entityManager.persist(truck);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
