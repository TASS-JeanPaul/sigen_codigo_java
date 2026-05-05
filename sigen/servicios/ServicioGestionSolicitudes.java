package sigen.servicios;

import sigen.modelo.Empleado;
import sigen.modelo.Licencia;
import sigen.modelo.Permiso;
import sigen.modelo.Solicitud;
import sigen.modelo.Vacaciones;
import java.util.List;

public class ServicioGestionSolicitudes {

    public void registrarLicencia(Licencia licencia) {
        // Registra una nueva solicitud de licencia
    }

    public void solicitarVacaciones(Vacaciones vacaciones) {
        // Registra una nueva solicitud de vacaciones
    }

    public void registrarPermiso(Permiso permiso) {
        // Registra una nueva solicitud de permiso
    }

    public List<Solicitud> consultarHistorial(Empleado empleado) {
        // Devuelve el historial de solicitudes del empleado
        return null;
    }

    public int consultarDiasDisponibles(Empleado empleado) {
        // Devuelve los dias de vacaciones disponibles del empleado
        return empleado.getDiasVacacionesDisp();
    }

    public void cancelarSolicitud(Solicitud solicitud) {
        solicitud.cancelar();
    }

    public String consultarEstado(Solicitud solicitud) {
        return solicitud.getEstado();
    }
}
