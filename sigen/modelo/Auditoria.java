package sigen.modelo;

import java.util.Date;

public class Auditoria {

    private int idAuditoria;
    private String accion;
    private Date fecha;
    private Usuario usuarioResponsable;
    private String descripcion;

    public Auditoria(int idAuditoria, String accion, Usuario usuarioResponsable, String descripcion) {
        this.idAuditoria = idAuditoria;
        this.accion = accion;
        this.usuarioResponsable = usuarioResponsable;
        this.descripcion = descripcion;
        this.fecha = new Date();
    }

    // Getters y Setters
    public int getIdAuditoria() { return idAuditoria; }
    public void setIdAuditoria(int idAuditoria) { this.idAuditoria = idAuditoria; }

    public String getAccion() { return accion; }
    public void setAccion(String accion) { this.accion = accion; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public Usuario getUsuarioResponsable() { return usuarioResponsable; }
    public void setUsuarioResponsable(Usuario usuarioResponsable) { this.usuarioResponsable = usuarioResponsable; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
