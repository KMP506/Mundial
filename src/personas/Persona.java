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
    protected LocalDate fechadenacimiento;
   

    
    public String getNombre(){
        return this.nombre;
    }
    
    public String  getNacionalidad(){
        return this.nacionalidad;
    }
    
    public LocalDate  getFechadenacimiento(){
        return this.fechadenacimiento;
    }
     
    public Persona(String nombre, String nacionalidad, LocalDate fechadenacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechadenacimiento = fechadenacimiento;
       
    
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fechadenacimiento=" + fechadenacimiento;
    }
    
    
}
