package day3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class empDaoImpl implements empDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MavenUnit");
    EntityManager em = emf.createEntityManager();

    @Override
    public void save(Object emp) throws EmployeeException{

    }

    @Override
    public String getEmployee(int empId) throws EmployeeException{
        return null;
    }

    @Override
    public String deleteEmployee(int empId, int bonus) throws EmployeeException{
        return null;
    }

    @Override
    public boolean updateEmployee(int empId) throws EmployeeException{
        return false;
    }

}
