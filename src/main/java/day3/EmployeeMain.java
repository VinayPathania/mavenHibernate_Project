package day3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MavenUnit");
        EntityManager em = emf.createEntityManager();

        // Inserting record
//        emp EmpL = new emp(20,"Raghav","lal Nagar",200000);
//
//        em.getTransaction().begin();
//        em.persist(EmpL);                  ----> for inserting record
//        em.remove(20);                     ----> for deleting record
//        em.getTransaction().commit();
//        System.out.println("Record inserted");

//        Bean class name should be same as table name in database
        emp Emp = em.find(emp.class,20);
        if(Emp!=null) System.out.println(Emp);
        else System.out.println("Record not found");
        em.close();
    }
}
