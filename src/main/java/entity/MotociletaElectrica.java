package entity;

/**
 *
 * @author Claudia_Parra
 */
public class MotociletaElectrica {
    
    private int idMotocicleta;
    private String fabricanteMotocicleta;
    private int precioUnitario;
    private String autonomiaBateria;
    private int idProveedorMotor;
    
    private String nombreProveedor;

    public MotociletaElectrica() {
    }

    public MotociletaElectrica(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public MotociletaElectrica(String fabricanteMotocicleta, int precioUnitario, String autonomiaBateria, int idProveedorMotor) {
        this.fabricanteMotocicleta = fabricanteMotocicleta;
        this.precioUnitario = precioUnitario;
        this.autonomiaBateria = autonomiaBateria;
        this.idProveedorMotor = idProveedorMotor;
    }

    public MotociletaElectrica(int idMotocicleta, String fabricanteMotocicleta, int precioUnitario, String autonomiaBateria, int idProveedorMotor) {
        this.idMotocicleta = idMotocicleta;
        this.fabricanteMotocicleta = fabricanteMotocicleta;
        this.precioUnitario = precioUnitario;
        this.autonomiaBateria = autonomiaBateria;
        this.idProveedorMotor = idProveedorMotor;
    }

    public MotociletaElectrica(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    
    

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public String getFabricanteMotocicleta() {
        return fabricanteMotocicleta;
    }

    public void setFabricanteMotocicleta(String fabricanteMotocicleta) {
        this.fabricanteMotocicleta = fabricanteMotocicleta;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(String autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getIdProveedorMotor() {
        return idProveedorMotor;
    }

    public void setIdProveedorMotor(int idProveedorMotor) {
        this.idProveedorMotor = idProveedorMotor;
    }

    @Override
    public String toString() {
        return "MotociletaElectrica{" + "idMotocicleta=" + idMotocicleta + ", fabricanteMotocicleta=" + fabricanteMotocicleta + ", precioUnitario=" + precioUnitario + ", autonomiaBateria=" + autonomiaBateria + ", idProveedorMotor=" + idProveedorMotor + ", nombreProveedor=" + nombreProveedor + '}';
    }

    
}
