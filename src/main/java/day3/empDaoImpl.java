package day3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class empDaoImpl implements empDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MavenUnit");
    EntityManager em = emf.createEntityManager();

    EmployeeException ee = new EmployeeException();


    @Override
    public void save(emp Emp) throws EmployeeException{

        try {
            em.getTransaction().begin();
            em.persist(Emp);
            em.getTransaction().commit();
            System.out.println("Record inserted");
            em.close();
        }catch (Exception e){
            ee.getMessage();
        }

    }

    @Override
    public String getEmployee(int empId) throws EmployeeException{
        emp Emp = em.find(emp.class,empId);
        if(Emp!= null) return Emp.toString();
        else return ee.getMessage();
    }

    @Override
    public String deleteEmployee(int empId) throws EmployeeException{
        String message = "Record not found";
        try{
            emp Emp = em.find(emp.class,empId);
            if (Emp==null) return message;
            else{
                em.getTransaction().begin();
                em.remove(empId);
                em.getTransaction().commit();
                em.close();
                return message = ("Record deleted");
            }

        }catch (Exception e){
            message = ee.getMessage();
        }
        return message;
    }

    @Override
    public boolean updateEmployee(emp Emp) throws EmployeeException{
        return false;
    }

}
