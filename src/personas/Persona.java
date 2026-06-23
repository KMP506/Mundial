/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.time.LocalDate;


/**
 *
 * @author ylpjk
 */
public class Persona {
    protected String nombre;
    protected String nacionalidad;
    protected  LocalDate fechaNacimiento;
    protected int edad;

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public int getEdad() {
        return this.edad;
    }

    public Persona(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }
    
    public String toSrting(){
        return "Nombre:"+nombre+"\nNacionalidad"+nacionalidad+ "Edad" + edad +
                "\nFecha Nacimiento"+fechaNacimiento;
    }
    
}
