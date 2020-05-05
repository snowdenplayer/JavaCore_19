import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String id;
    private transient  int salary;
    private static int index=0;


    public Employee(String name, int salary) {
        this.name = name;
        this.id = "Empl-" + ++index;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}
