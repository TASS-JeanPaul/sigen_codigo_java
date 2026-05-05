package sigen.modelo;

import java.util.Date;

public abstract class Solicitud {

    protected int idSolicitud;
    protected Date fechaCreacion;
    protected Date fechaInicio;
    protected Date fechaFin;
    protected String estado;
    protected String descripcion;
    protected Date fechaAprobacion;
    protected String comentariosRevision;
    protected Empleado solicitante;

    public Solicitud(int idSolicitud, String descripcion, Empleado solicitante,
                     Date fechaInicio, Date fechaFin) {
        this.idSolicitud = idSolicitud;
        this.descripcion = descripcion;
        this.solicitante = solicitante;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaCreacion = new Date();
        this.estado = "PENDIENTE";
        this.fechaAprobacion = null;
        this.comentariosRevision = "";
    }

    public void aprobar() {
        this.estado = "APROBADA";
        this.fechaAprobacion = new Date();
    }

    public void rechazar(String motivo) {
        this.estado = "RECHAZADA";
        this.fechaAprobacion = new Date();
        this.comentariosRevision = motivo;
    }

    public void cancelar() {
        this.estado = "CANCELADA";
    }

    // Getters y Setters
    public int getIdSolicitud() { return idSolicitud; }
    public void setIdSolicitud(int idSolicitud) { this.idSolicitud = idSolicitud; }

    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Date getFechaAprobacion() { return fechaAprobacion; }
    public void setFechaAprobacion(Date fechaAprobacion) { this.fechaAprobacion = fechaAprobacion; }

    public String getComentariosRevision() { return comentariosRevision; }
    public void setComentariosRevision(String comentariosRevision) { this.comentariosRevision = comentariosRevision; }

    public Empleado getSolicitante() { return solicitante; }
    public void setSolicitante(Empleado solicitante) { this.solicitante = solicitante; }
}
