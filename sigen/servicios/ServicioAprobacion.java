package sigen.servicios;

import sigen.modelo.Solicitud;

public class ServicioAprobacion {

    public void aprobarSolicitud(Solicitud solicitud) {
        solicitud.aprobar();
    }

    public void rechazarSolicitud(Solicitud solicitud, String motivo) {
        solicitud.rechazar(motivo);
    }

    public void agregarComentariosRevision(Solicitud solicitud, String comentarios) {
        solicitud.setComentariosRevision(comentarios);
    }
}
