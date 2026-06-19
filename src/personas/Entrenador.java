/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.time.LocalDate;
/**
 *
 * @author kevin
 */
public class Entrenador extends Persona {
    protected int añosExperiencia;
    
    public int getAñosExperiencia(){
        return this.añosExperiencia;
    }
    
    public Entrenador(String nombre, String nacionalidad, LocalDate fechadenacimiento,int añosExperiencia){
        super(nombre,nacionalidad,fechadenacimiento);
    }
    @Override
    public String toString(){
        return super.toString()+", Años de experiencia= "+ añosExperiencia;
    }
}
