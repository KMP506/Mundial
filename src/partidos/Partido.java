/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;
import tiposelecciones.Tiposeleccion;
import java.time.LocalTime;
import java.time.LocalDate;
/**
 *
 * @author pg610
 */
public class Partido extends Tiposeleccion {
    
  
    protected String estadio;
    protected LocalDate fecha;
    protected LocalTime Hora;
    protected double resultado;
    protected String arbitro;
    
    public String getEstadio() {
        return estadio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return Hora;
    }

    public double getResultado() {
        return resultado;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime Hora) {
        this.Hora = Hora;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public Partido(String estadio, LocalDate fecha, LocalTime Hora, double resultado, String arbitro, String seleccionLocal, String seleccionVisitante) {
        super(seleccionLocal, seleccionVisitante);
        this.estadio = estadio;
        this.fecha = fecha;
        this.Hora = Hora;
        this.resultado = resultado;
        this.arbitro = arbitro;
    }

    @Override
    public String toString() {
        return "Partido{" + "estadio=" + estadio + ", fecha=" + fecha + ", Hora=" + Hora + ", resultado=" + resultado + ", arbitro=" + arbitro + '}';
    }
    

   
    
    
    
    
    
    
    
    
    
    
}        
