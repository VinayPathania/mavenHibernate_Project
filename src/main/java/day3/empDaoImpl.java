package day3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class empDaoImpl implements empDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MavenUnit");
    EntityManager em = emf.createEntityManager();


    @Override
    public void save(emp Emp) throws EmployeeException{

        try {
            em.getTransaction().begin();
            em.persist(Emp);
            em.getTransaction().commit();
            System.out.println("Record inserted");
            em.close();
        }catch (Exception e){
            throw new EmployeeException("record not added");
        }

    }

    @Override
    public String getEmployee(int empId) throws EmployeeException{
        emp Emp = em.find(emp.class,empId);
        if(Emp!= null) return Emp.toString();
        else  throw new EmployeeException("Record not found");
    }

    @Override
    public String deleteEmployee(int empId) throws EmployeeException{
        String message;
            emp Emp = em.find(emp.class,empId);
            if (Emp==null) throw new EmployeeException("Record not found");
            else{
                em.getTransaction().begin();
                em.remove(empId);
                em.getTransaction().commit();
                em.close();
                 message = ("Record deleted");
            }
        return message;
    }

    @Override
    public boolean updateEmployee(emp Emp) throws EmployeeException{
        boolean flag = false;
         Emp = em.find(emp.class,Emp.getEmpId());
         if(Emp==null) throw new EmployeeException("Invalid account");
         else{
            em.getTransaction().begin();
            em.merge(Emp);
            flag  = true;
            em.getTransaction().commit();
         }
        return false;
    }

}
