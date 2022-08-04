package entity;

/**
 *
 * @author PatitoSystems
 */
public class Proveedor {
    
    private int idProveedor;
    private String nombreProveedor;
    private String direccion;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Proveedor(String nombreProveedor, String direccion, String telefono) {
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
     public Proveedor(int idProveedor,String nombreProveedor, String direccion, String telefono) {
        this.idProveedor = idProveedor;
         this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombreProveedor=" + nombreProveedor + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }


}
