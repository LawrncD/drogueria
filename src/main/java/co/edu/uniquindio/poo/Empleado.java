package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    private final String idEmpleado;
    private final double salario;

    /*
     * Método constructor de la clase Empleado
     */
    public Empleado (String idEmpleado, double salario, String nombres, String apellidos, String dni, String direccion, String telefono){
        super(nombres, apellidos, dni, direccion, telefono);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    /*
     * Método para obtener el id de un empleado
     */
    public String getIdEmpleado (){
        return idEmpleado;
    }

    /*
     * Método para obtener el salario de un empleado
     */
    public double getSalario (){
        return salario;
    }

    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Empleado [idEmpleado=" + idEmpleado + ", salario=" + salario + "]";
    } 
}