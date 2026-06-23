/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author ylpjk
 */
public class Arbitro extends Persona{
        private int categoria;
        
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public Arbitro(int categoria) {
        this.categoria = categoria;
    }
    
     public Arbitro(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(nombre, nacionalidad, fechaNacimiento);
    }
     
    public String toString(){
    public String categoria1 = categoria==1? "Principal":"Asistente";

    return "\n Arbitro: "+ categoria1+"\nNombre"+getNombre() + "\nNacionalidad"+getNacionalidad() +
                "\nFechaNacimiento"+getFechaNacimiento()+
    }
    }
