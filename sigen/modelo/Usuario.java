package sigen.modelo;

public class Usuario {

    protected int idUsuario;
    protected String nombreCompleto;
    protected String correoElectronico;
    protected String contrasenaAcceso;
    protected String rolUsuario;
    protected String areaTrabajo;
    protected boolean estadoActivo;

    public Usuario(int idUsuario, String nombreCompleto, String correoElectronico,
                   String contrasenaAcceso, String rolUsuario, String areaTrabajo) {
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.contrasenaAcceso = contrasenaAcceso;
        this.rolUsuario = rolUsuario;
        this.areaTrabajo = areaTrabajo;
        this.estadoActivo = true;
    }

    public void activarCuenta()    { this.estadoActivo = true; }
    public void desactivarCuenta() { this.estadoActivo = false; }

    // Getters y Setters
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getContrasenaAcceso() { return contrasenaAcceso; }
    public void setContrasenaAcceso(String contrasenaAcceso) { this.contrasenaAcceso = contrasenaAcceso; }

    public String getRolUsuario() { return rolUsuario; }
    public void setRolUsuario(String rolUsuario) { this.rolUsuario = rolUsuario; }

    public String getAreaTrabajo() { return areaTrabajo; }
    public void setAreaTrabajo(String areaTrabajo) { this.areaTrabajo = areaTrabajo; }

    public boolean isEstadoActivo() { return estadoActivo; }
    public void setEstadoActivo(boolean estadoActivo) { this.estadoActivo = estadoActivo; }
}
