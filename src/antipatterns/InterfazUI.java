/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antipatterns;

/**
 *
 * @author educacionit
 */
public class InterfazUI {
    public void botonReservar(DatosReserva datosReserva) {
        ((Logger)Singleton.getInstane().serviceLocator.get("logger")).warning("Estoy por reservar!!!");
        ((AdminReserva)Singleton.getInstane().serviceLocator.get("ar")).realizarReserva(datosReserva);
        ((Logger)Singleton.getInstane().serviceLocator.get("logger")).warning("Ya hize la reserva!!!");
    }
}
