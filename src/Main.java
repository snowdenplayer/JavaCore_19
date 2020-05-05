import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("main.txt");
        Employee vasya = new Employee("Vasya",5000);
        Employee eldar = new Employee("Eldar",4500);

        Methods.serialize(file,(Serializable) vasya);
        System.out.println(Methods.deserealize(file));
        Collection<Employee> list = new ArrayList<>();
        int k = 500,j=65;
        for (int i = 0; i < 5; i++,j++) {
            list.add(new Employee("Vasya"+(char)j,5000+k));
            k+=200;
        }

        Methods.serialize(file,(Serializable) list);
        System.out.println(Methods.deserealize(file));



    }
}
