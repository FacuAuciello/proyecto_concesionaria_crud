
package com.mycompany.concesionario.persistencia;

import com.mycompany.concesionario.logica.Automovil;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }
    
}
