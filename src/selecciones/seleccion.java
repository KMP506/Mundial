/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selecciones;
import personas.Entrenador;
/**
 *
 * @author monto
 */
public class seleccion {
    
    protected String nombre;
    protected String grupo;
    protected  Entrenador entrenador;
    protected String jugadores;

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public String getJugadores() {
        return jugadores;
        
        
        
    }

    public seleccion(String nombre, String grupo, Entrenador entrenador, String jugadores) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenador = entrenador;
        this.jugadores = jugadores;
    }

    
    
    
    
    
    
}
