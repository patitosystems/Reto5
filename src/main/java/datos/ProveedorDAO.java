package datos;

import entity.Proveedor;
import java.sql.*;
import java.util.*;

/**
 *
 * @author PatitoSystems
 */
public class ProveedorDAO {
    private static final String SELECT = "SELECT p.id_proveedor, p.nombre_proveedor, p.direccion, p.telefono FROM proveedor p";
    private static final String INSERT = "INSERT INTO proveedor (nombre_proveedor,direccion,telefono) VALUES (?,?,?)";
    private static final String UPDATE = "UPDATE proveedor SET nombre_proveedor = ? ,direccion = ? ,telefono = ? WHERE id_proveedor = ?";
    private static final String DELETE = "DELETE FROM proveedor WHERE id_proveedor = ?";
    
    public List<Proveedor> getProveedores() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Proveedor proveedor = null;
        List<Proveedor> proveedores = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SELECT);
            rs = ps.executeQuery();
            
            while (rs.next()){
                int idProveedor = rs.getInt("id_proveedor");
                String nombreProveedor = rs.getString("nombre_proveedor");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                
                proveedor = new Proveedor(idProveedor, nombreProveedor, direccion, telefono);
                
                proveedores.add(proveedor);
            }
            
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        }
        finally{
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException ex) {
                System.out.println("ex = " + ex);
            }
            
        }
        
        return proveedores;
    }
    
    public int insert(Proveedor proveedor){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(INSERT);
            ps.setString(1, proveedor.getNombreProveedor());
            ps.setString(2, proveedor.getDireccion());
            ps.setString(3, proveedor.getTelefono());
            
            registros = ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);  
        } finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException ex) {
                System.out.println("ex = " + ex);
            }
            
        }
        
        return registros;
    } 
    
    public int update(Proveedor proveedor){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(UPDATE);
            ps.setString(1, proveedor.getNombreProveedor());
            ps.setString(2, proveedor.getDireccion());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            
            registros = ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        } finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException ex) {
                System.out.println("ex = " + ex);
            }
            
        }
        
        return registros;
    } 
    
    public int delete(Proveedor proveedor){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(DELETE);
            ps.setInt(1, proveedor.getIdProveedor());
            
            registros = ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        } finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException ex) {
                System.out.println("ex = " + ex);
            }
            
        }
        
        return registros;
    } 
}
