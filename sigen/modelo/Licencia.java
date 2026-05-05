package sigen.modelo;

import java.util.Date;

public class Licencia extends Solicitud {

    private int idLicencia;
    private String tipoLicencia;
    private String docSoporte;
    private boolean remunerada;

    public Licencia(int idSolicitud, int idLicencia, String descripcion,
                    Empleado solicitante, Date fechaInicio, Date fechaFin,
                    String tipoLicencia, String docSoporte, boolean remunerada) {
        super(idSolicitud, descripcion, solicitante, fechaInicio, fechaFin);
        this.idLicencia = idLicencia;
        this.tipoLicencia = tipoLicencia;
        this.docSoporte = docSoporte;
        this.remunerada = remunerada;
    }

    // Getters y Setters
    public int getIdLicencia() { return idLicencia; }
    public void setIdLicencia(int idLicencia) { this.idLicencia = idLicencia; }

    public String getTipoLicencia() { return tipoLicencia; }
    public void setTipoLicencia(String tipoLicencia) { this.tipoLicencia = tipoLicencia; }

    public String getDocSoporte() { return docSoporte; }
    public void setDocSoporte(String docSoporte) { this.docSoporte = docSoporte; }

    public boolean isRemunerada() { return remunerada; }
    public void setRemunerada(boolean remunerada) { this.remunerada = remunerada; }
}
