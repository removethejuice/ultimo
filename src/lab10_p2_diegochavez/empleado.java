
package lab10_p2_diegochavez;


public class empleado {
    private String nombre;
    private int edad;
    private String identidad;
    private int num;

    public empleado() {
    }

    public empleado(String nombre, int edad, String identidad, int num) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public int getNum() {
        return num;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", edad=" + edad + ", identidad=" + identidad + ", num=" + num + '}';
    }
    
}
