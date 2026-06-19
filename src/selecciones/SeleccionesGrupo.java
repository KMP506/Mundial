/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package selecciones;

/**
 *
 * @author monto
 */

    
public enum SeleccionesGrupo {
    GRUPO_A("Grupo A"),
    GRUPO_B("Grupo B"),
    GRUPO_C("Grupo C"),
    GRUPO_D("Grupo D"),
    GRUPO_E("Grupo E"),
    GRUPO_F("Grupo F"),
    GRUPO_G("Grupo G"),
    GRUPO_H("Grupo H"),
    GRUPO_I("Grupo I"),
    GRUPO_J("Grupo J"),
    GRUPO_K("Grupo K"),
    GRUPO_L("Grupo L");

    protected String nombre;

    SeleccionesGrupo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
