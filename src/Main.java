import models.Employee;
import models.Rectangle;

public class Main {
    public static void main(String[] args) {
        //region PUNTO 1
        //Inicializar un objeto estableciedno ancho y alto;
        Rectangle rect = new Rectangle(1.0, 1.0);

        //Imprimir por pantalla el ancho y alto del rectangulo
        System.out.println("Rectangle Height: " + rect.getHeight());
        System.out.println("Rectangle Width: " + rect.getWidth());

        //Modificando el alto y ancho de la instancia con los metodos setters
        rect.setHeight(2.5);
        rect.setWidth(3.2);

        //imprimer el area y el perimetro del rectangulo

        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());

        //Inicializar un objeto con el ancho y alto predeterminados
        Rectangle rectangle = new Rectangle();
        System.out.println("Ancho predeterminado: "+rectangle.getWidth() + ", Altura predeterminada: " + rectangle.getHeight());
        //endregion

        //region PUNTO 2
        // Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
        //25000.
        Employee employee = new Employee("Carlos","Gutierrez","23456345",25000.0);
        //Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        //27500.
        Employee employee2 = new Employee("Ana","Sanchez","34234123",27500.0);

        //c. Imprima ambos objetos por pantalla
        System.out.println(employee);
        System.out.println(employee2);

        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        //salario anual del mismo.
        employee.increaseSalary(15.0);
        System.out.println(employee);
        System.out.println(employee.anualSalary());

        //endregion
    }
}
