package entity;

/**
 *
 * @author Claudia_Parra
 */
public class Cliente {
    
    private int idCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private String correoElectronico;
    private String celular;
    private String alias;
    private int contrasena;
    private String fechaNacimiento;
    
    
    public Cliente(){
    }
    
    public Cliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public Cliente(String nombreCliente, String apellidosCliente, String correoElectronico, String celular, String alias,int contrasena,String fechaNacimiento){
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.alias = alias;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Cliente(int idCliente,String nombreCliente, String apellidosCliente, String correoElectronico, String celular, String alias,int contrasena,String fechaNacimiento){
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.alias = alias;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidosCliente=" + apellidosCliente + ", correoElectronico=" + correoElectronico + ", celular=" + celular + ", alias=" + alias + ", contrasena=" + contrasena + ", fechaNacimiento=" + fechaNacimiento + '}';
    }    
}
