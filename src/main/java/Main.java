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


        Vehicle bike =
                new Bike("puma", new BigDecimal("1400.87"), "no Fuel");
        Vehicle car =
                new Car("golf", new BigDecimal("14000"), "gasoline",5);
        Vehicle plane =
                new Plane("A-130", new BigDecimal("140000"), "Jet",  200);
        Vehicle truck =
                new Truck("volvo", new BigDecimal("50000"), "diesel", 20000.56);

        entityManager.persist(bike);
        entityManager.persist(car);
        entityManager.persist(plane);
        entityManager.persist(truck);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
