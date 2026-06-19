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
public class Arbitro extends Persona {
    
    
    
    
    protected String categoria;


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Arbitro(String nombre, String nacionalidad, LocalDate fechadenacimiento, String categoria) {
        super(nombre,nacionalidad,fechadenacimiento);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return   "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + this.getEdad()+ ", categoria=" + categoria;
    }

    
    
    
}