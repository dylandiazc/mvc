/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import mvc.controladores.Controlador;
import mvc.modelos.Modelo;
import mvc.vistas.Vistas;

/**
 *
 * @author 57305
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Vistas vista = new Vistas();
      vista.setVisible(true);
      Modelo modelo = new Modelo();
      Controlador controlador = new Controlador(modelo, vista);
        
    }
    
}
