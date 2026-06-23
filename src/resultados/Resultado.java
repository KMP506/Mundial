/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;
import selecciones.seleccion;
/**
 *
 * @author ylpjk
 */
public class Resultado {
    private seleccion seleccion;
    private String marcador;

    public Resultado() {
        this.seleccion = null;
        this.marcador = "0-0";
    }

    
    public seleccion getSeleccion() {
        return seleccion;
    }

    
    public void setSeleccion(seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
    
    
    public boolean esEmpate(int golesLocal, int golesVisitante) {
        if (golesLocal == golesVisitante) {
            return true;
        } else {
            return false;
        }
    }
   
    public int calcularDiferenciaGoles(int golesLocal, int golesVisitante) {
        int diferencia = golesLocal - golesVisitante;
        return Math.abs(diferencia);
    }
   
    public int totalGolesPartido(int golesLocal, int golesVisitante) {
        return golesLocal + golesVisitante;
    }
   
    public boolean ambosAnotaron(int golesLocal, int golesVisitante) {
        if (golesLocal > 0 && golesVisitante > 0) {
            return true;
        } else {
            return false;
        }
    } 
   
    public String obtenerGanador(int golesLocal, int golesVisitante) {
        if (golesLocal > golesVisitante) {
            return "Ganó el equipo local";
        } else if (golesVisitante > golesLocal) {
            return "Ganó el equipo visitante";
        } else {
            return "Fue un empate";
        }
    }

}
