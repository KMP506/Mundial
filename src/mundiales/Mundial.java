/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundiales;
import java.time.LocalDate;
import selecciones.seleccion;
import selecciones.SeleccionesGrupo;
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
    protected seleccion listaSelecciones[]=new seleccion[48];
    protected int contaSelecciones=0;
    protected Partido listaPartidos[]=new Partido[100];
    protected int contaPartidos=0;
    
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
    
       public void agregarSeleccion(seleccion nombre){
       if(listaSelecciones.length ==contaSelecciones){
           System.out.println("No hay espacio disponible");
           return;
       }
       listaSelecciones[contaSelecciones]=nombre;
       contaSelecciones++;
   }
   
   public void eliminarSeleccion(seleccion nombre){
        int posic = -1;

    for (int i = 0; i < contaSelecciones; i++){
        if (listaSelecciones[i].equals(nombre)){
            posic = i;
            break;
            }
       }
       if(posic == -1){
           System.out.println("Jugador no encontrado");
           return;
       }
       for (int i = posic; i < contaSelecciones - 1; i++){
       listaSelecciones[i] = listaSelecciones[i + 1];
   }
       listaSelecciones[contaSelecciones - 1]= null;
       contaSelecciones --;
   }      
   
    public int buscarSeleccion(seleccion nombre){
       for(int i = 0; i < contaSelecciones; i++){
           if (listaSelecciones[i].equals(nombre)){
               return i;
           }
       }
       return -1;
   }
    
     public int contarSeleccion(){
       return contaSelecciones;
   }
     
       public boolean existeSeleccion(seleccion nombre){
       for (int i = 0; i < contaSelecciones; i++){
            if (listaSelecciones[i].equals(nombre)){
                return true;
            }
       }
       return false;
   }
     
     public seleccion[] obtenerSeleccionesPorGrupo(SeleccionesGrupo grupo){
    seleccion[] temp = new seleccion[contaSelecciones];
    int count = 0;

    for(int i = 0; i < contaSelecciones; i++){
        if(listaSelecciones[i].getGrupo().equalsIgnoreCase(grupo.getNombre())){
            temp[count++] = listaSelecciones[i];
        }
    }
    seleccion[] resultado = new seleccion[count];
    for(int i = 0; i < count; i++){
        resultado[i] = temp[i];
    }

    return resultado;
}
     
       public void agregarPartido(Partido nombre){
       if(listaPartidos.length ==contaPartidos){
           System.out.println("No hay espacio disponible");
           return;
       }
       listaPartidos[contaPartidos]=nombre;
       contaPartidos++;
   }
       
        public void eliminarPartido(Partido nombre){
        int p=-1;

    for (int i = 0; i < contaPartidos; i++){
        if (listaPartidos[i].equals(nombre)){
            p=i;
            break;
            }
       }
       if(p==-1){
           System.out.println("Jugador no encontrado");
           return;
       }
       for (int i=p; i < contaPartidos - 1; i++){
       listaPartidos[i] = listaPartidos[i + 1];
   }
       listaPartidos[contaPartidos - 1]= null;
       contaPartidos--;
   }  
       
        public int contarPartido(){
       return contaPartidos;
   }
        
        
        
    @Override
    public String toString() {
        return "Mundial{" + "nombre=" + nombre + ", año=" + año + ", pais=" + pais + ", seleccion=" + seleccion+ ", equipo A=" + partidos + "equipo B= "+partidosResultado ;
    }
}
