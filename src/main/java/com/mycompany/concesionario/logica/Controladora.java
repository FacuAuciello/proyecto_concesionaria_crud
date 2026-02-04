
package com.mycompany.concesionario.logica;

import com.mycompany.concesionario.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String marca, String modelo, int kms, String motor, String patente, String color, int cantidadPuertas) {
        
        Automovil auto = new Automovil();
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setKms(kms);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setColor(color);
        auto.setCantidadPuertas(cantidadPuertas);
        
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAutos(int idAuto) {
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, 
            String marca, String modelo, int kms, String motor, String patente, String color, int cantidadPuertas) {
        
        //datos modificados
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setKms(kms);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setColor(color);
        auto.setCantidadPuertas(cantidadPuertas);
        
        //le pido a la persistencia que modifique
        controlPersis.modificarAuto(auto);
    }
    
    
    
}
