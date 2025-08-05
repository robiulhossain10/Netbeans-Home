
import com.methods.methodexample.MidMonthJAVA.CRUDOperations;
import com.methods.methodexample.MidMonthJAVA.Employee;
import java.time.LocalDate;
import java.util.Properties;

public class DBMain {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("db.url", "jdbc:mysql://localhost:3306/test_db");
        props.setProperty("db.user", "root");
        props.setProperty("db.pass", "");

        CRUDOperations crud = new CRUDOperations(props);
        Employee emp = new Employee("Robiul", "Developer", 50000.00, LocalDate.now());
        crud.insertData(emp);  // make sure insertData is not static
    }
}
