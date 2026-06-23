/*Ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;
import tiposelecciones.Tiposeleccion;
import java.time.LocalTime;
import java.time.LocalDate;
import personas.Arbitro;
import resultados.Resultado;
/**
 *
 * @author pg610
 */
public class Partido extends Tiposeleccion {
    protected String estadio;
    protected LocalDate fecha;
    protected LocalTime Hora;
    protected Arbitro arbitro[];
    private Resultado resultado;
    private int contador;

    public String getEstadio() {
        return estadio;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public LocalTime getHora() {
        return Hora;
    }
    public Resultado getResultado() {
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
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
    public Partido(String estadio, LocalDate fecha, LocalTime Hora, String seleccionLocal, String seleccionVisitante, Arbitro arbitro[],double resultado) {
        super(seleccionLocal, seleccionVisitante);
        this.estadio = estadio;
        this.fecha = fecha;
        this.Hora = Hora;
        this.arbitro = arbitro;
        this.resultado = new Resultado();
    } 
    public void agregarArbitro(String nombre){
        if (contador < arbitro.length) {
            contador++;
        }
    }
       public void eliminarArbitro(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (arbitro[i].getNombre().equals(nombre)) {
            for (int j = i; j < contador - 1; j++) {
                arbitro[j] = arbitro[j + 1];
            }
            arbitro[contador - 1] = null;
            contador--;
                break;
            }
        }
    }
       
       public Arbitro buscarArbitro(String nombre) {
    for (int i = 0; i < contador; i++) {
        if (arbitro[i].getNombre().equals(nombre)) {
            return arbitro[i]; 
        }
    }

    return null; 
}
       public int contadorArbitros(){
           return contador;
       }
       
       public boolean existeArbitro(String nombre) {
    for (int i = 0; i < contador; i++) {
        if (arbitro[i].getNombre().equals(nombre)) {
            return true; 
        }
    }
    return false; 
}

    @Override
    public String toString() {
        return "Partido{" + "estadio=" + estadio + ", fecha=" + fecha + ", Hora=" + Hora + ", resultado=" + resultado + ", arbitro=" + arbitro + '}';
    }  
}        
