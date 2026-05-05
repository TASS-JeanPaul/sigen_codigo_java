package sigen.modelo;

import java.util.Date;

public class Permiso extends Solicitud {

    private int idPermiso;
    private String motivo;
    private String tipoPermiso;
    private int diasSolicitados;

    public Permiso(int idSolicitud, int idPermiso, String descripcion,
                   Empleado solicitante, Date fechaInicio, Date fechaFin,
                   String motivo, String tipoPermiso, int diasSolicitados) {
        super(idSolicitud, descripcion, solicitante, fechaInicio, fechaFin);
        this.idPermiso = idPermiso;
        this.motivo = motivo;
        this.tipoPermiso = tipoPermiso;
        this.diasSolicitados = diasSolicitados;
    }

    // Getters y Setters
    public int getIdPermiso() { return idPermiso; }
    public void setIdPermiso(int idPermiso) { this.idPermiso = idPermiso; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getTipoPermiso() { return tipoPermiso; }
    public void setTipoPermiso(String tipoPermiso) { this.tipoPermiso = tipoPermiso; }

    public int getDiasSolicitados() { return diasSolicitados; }
    public void setDiasSolicitados(int diasSolicitados) { this.diasSolicitados = diasSolicitados; }
}
