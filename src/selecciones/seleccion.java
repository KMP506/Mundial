/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selecciones;

/**
 *
 * @author monto
 */
public class seleccion {
    protected String nombre;
    protected String grupo;
    protected int entrenadores;
    static String jugadores [] = new String[26];
    protected int posic = -1;
    protected static int contaJugador = 0;
    public String getNombre() {
        return nombre;
    }
    
    public String getGrupo() {
        return grupo;
    }
    
    public int getEntrenadores() {
        return entrenadores;
    }
    
    public static String[] getJugadores() {
        return jugadores;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEntrenadores(int entrenadores) {
        this.entrenadores = entrenadores;
    }
    
   public void agregarJugador(String nombre){
       if(jugadores.length == contaJugador){
           System.out.println("No hay espacio disponible");
           return;
       }
       jugadores[contaJugador] = nombre;
       contaJugador++;
   }
   
   public void eliminarJugador(String nombre){
        int posic = -1;

    for (int i = 0; i < contaJugador; i++){
        if (jugadores[i].equals(nombre)){
            posic = i;
            break;
            }
       }
       if(posic == -1){
           System.out.println("Jugador no encontrado");
           return;
       }
       for (int i = posic; i < contaJugador - 1; i++){
       jugadores[i] = jugadores[i + 1];
   }
       jugadores[contaJugador - 1]= null;
       contaJugador --;
   }    
   
   public int buscarJugador(String nombre){
       for(int i = 0; i < contaJugador; i++){
           if (jugadores[i].equals(nombre)){
               return i;
           }
       }
       return -1;
   }
   
   public boolean existeJugador(String nombre){
       for (int i = 0; i < contaJugador; i++){
            if (jugadores[i].equals(nombre)){
                return true;
            }
       }
       return false;
   }
   
   public int contarJugador(){
       return contaJugador;
   }
   
   
   
   
   public seleccion(String nombre, String grupo, int entrenadores ) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenadores = entrenadores;
    }
}