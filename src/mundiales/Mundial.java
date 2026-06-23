/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundiales;
import java.time.LocalDate;
import selecciones.seleccion;
import partidos.Partido;
/**
 *
 * @author kevin
 */

public class Mundial {
    protected String nombre;
    protected LocalDate año;
    protected String seleccion;
    protected Partido partidos;
    protected Partido partidosResultado;
    protected String pais;
    
    public String getNombre(){
        return nombre;
    }
    public LocalDate getAño(){
        return año;
    }
    public String getPais(){
        return pais;
    }
    
    public Partido getPartidos(){
        return partidos;
    }
    
    public Partido getPartidosResultado(){
        return partidosResultado;
    }
    
   public String getSeleccion(){
       return seleccion;
   }
   
   public void setAño(LocalDate año){
       this.año=año;
   }
   
    public Mundial(String nombre,LocalDate año, String pais,seleccion Nomseleccion, Partido partidos, Partido partidosResultado){
        this.nombre=nombre;
        this.año=año;
        this.pais=pais;
        this.seleccion=Nomseleccion.getNombre();
        this.partidos=partidos;
        this.partidosResultado=partidosResultado;
        
    }
    
    @Override
    public String toString() {
        return "Mundial{" + "nombre=" + nombre + ", año=" + año + ", pais=" + pais + ", seleccion=" + seleccion+ ", equipo A=" + partidos + "equipo B= "+partidosResultado ;
    }
}
