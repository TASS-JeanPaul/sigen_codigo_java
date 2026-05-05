package sigen.modelo;

import java.util.Date;

public class Novedad extends Solicitud {

    private int idNovedad;
    private String tipoNovedad;
    private boolean justificada;
    private String docSoporte;

    public Novedad(int idSolicitud, int idNovedad, String descripcion,
                   Empleado solicitante, Date fechaInicio, Date fechaFin,
                   String tipoNovedad, boolean justificada, String docSoporte) {
        super(idSolicitud, descripcion, solicitante, fechaInicio, fechaFin);
        this.idNovedad = idNovedad;
        this.tipoNovedad = tipoNovedad;
        this.justificada = justificada;
        this.docSoporte = docSoporte;
    }

    // Getters y Setters
    public int getIdNovedad() { return idNovedad; }
    public void setIdNovedad(int idNovedad) { this.idNovedad = idNovedad; }

    public String getTipoNovedad() { return tipoNovedad; }
    public void setTipoNovedad(String tipoNovedad) { this.tipoNovedad = tipoNovedad; }

    public boolean isJustificada() { return justificada; }
    public void setJustificada(boolean justificada) { this.justificada = justificada; }

    public String getDocSoporte() { return docSoporte; }
    public void setDocSoporte(String docSoporte) { this.docSoporte = docSoporte; }
}
