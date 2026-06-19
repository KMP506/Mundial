/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundiales;

/**
 *
 * @author kevin
 */

public class Mundial {
    protected String nombre;
    protected int año;
    protected String pais;
    
    public String getNombre(){
        return nombre;
    }
    public int getAño(){
        return año;
    }
    public String getPais(){
        return pais;
    }
    
    public Mundial(String nombre,int año, String pais){
        this.nombre=nombre;
        this.año=año;
        this.pais=pais;
    }
}
