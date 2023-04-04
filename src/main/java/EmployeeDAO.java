import java.io.IOException;
import java.util.List;

    public interface EmployeeDAO {
        void add(Employee employee) throws IOException;

        Employee getBuyId(int Id);

        List<Employee> getAllEmployee() throws IOException;

        void updateEmployee(int id, Employee employee) throws IOException;

        void deleteEmployee(int id);

        Employee getById(int id) throws IOException;
    }







