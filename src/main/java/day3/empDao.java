package day3;

public interface empDao {
    void save(Object emp) throws EmployeeException;
    public String getEmployee(int empId) throws EmployeeException;
    public String deleteEmployee(int empId, int bonus) throws EmployeeException;
    public boolean updateEmployee(int empId) throws EmployeeException;

}
