/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposelecciones;

/**
 *
 * @author pg610
 */
public class Tiposeleccion {
    protected String seleccionLocal;
    protected String seleccionVisitante;

    public String getSeleccionLocal() {
        return seleccionLocal;
    }

    public String getSeleccionVisitante() {
        return seleccionVisitante;
    }

    public void setSeleccionLocal(String seleccionLocal) {
        this.seleccionLocal = seleccionLocal;
    }

    public void setSeleccionVisitante(String seleccionVisitante) {
        this.seleccionVisitante = seleccionVisitante;
    }

    public Tiposeleccion(String seleccionLocal, String seleccionVisitante) {
        this.seleccionLocal = seleccionLocal;
        this.seleccionVisitante = seleccionVisitante;
    }
    
    
}
