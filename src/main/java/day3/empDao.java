package day3;

public interface empDao {
    void save(emp Emp) throws EmployeeException;
    public String getEmployee(int empId) throws EmployeeException;
    public String deleteEmployee(int empId) throws EmployeeException;
    public boolean updateEmployee(emp Emp) throws EmployeeException;

}
