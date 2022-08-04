package datos;

import entity.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PatitoSystems
 */
public class ClienteDAO {
    
    private static final String SELECT = "SELECT c.id_clientes, c.nombres_cliente, c.apellidos_cliente, c.correo_electronico, c.celular, c.alias, c.contraseña, c.fecha_nacimiento  FROM clientes c";
    private static final String SELECT_APELLIDO = "SELECT c.id_clientes, c.nombres_cliente, c.apellidos_cliente, c.correo_electronico, c.celular, c.alias, c.contraseña, c.fecha_nacimiento  FROM clientes c WHERE c.apellidos_cliente = 'Cruz'";
    private static final String INSERT = "INSERT INTO clientes (id_clientes,nombres_cliente,apellidos_cliente,correo_electronico,celular,alias,contraseña,fecha_nacimiento) VALUES (?,?,?,?,?,?,?,?)";
    private static final String UPDATE = "UPDATE clientes SET nombres_cliente = ? ,apellidos_cliente = ? ,correo_electronico = ? ,celular = ? ,alias = ? ,contraseña = ? ,fecha_nacimiento = ? WHERE id_clientes = ?";
    private static final String DELETE = "DELETE FROM clientes WHERE id_clientes = ?";
    
    public List<Cliente> getClientes() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SELECT);
            rs = ps.executeQuery();
            
            while (rs.next()){
                int idCliente = rs.getInt("id_clientes");
                String nombreCliente = rs.getString("nombres_cliente");
                String apellidosCliente = rs.getString("apellidos_cliente");
                String correoElectronico = rs.getString("correo_electronico");
                String celular = rs.getString("celular");
                String alias = rs.getString("alias");
                int contrasena = rs.getInt("contraseña");
                String fchaNacimiento = rs.getString("fecha_nacimiento");
                
                cliente = new Cliente(idCliente, nombreCliente, apellidosCliente, correoElectronico, celular, alias, contrasena, fchaNacimiento);
                
                clientes.add(cliente);
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
        
        return clientes;
    }
    
    public int insert(Cliente cliente){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(INSERT);
            ps.setInt(1, cliente.getIdCliente());
            ps.setString(2, cliente.getNombreCliente());
            ps.setString(3, cliente.getApellidosCliente());
            ps.setString(4, cliente.getCorreoElectronico());
            ps.setString(5, cliente.getCelular());
            ps.setString(6, cliente.getAlias());
            ps.setInt(7, cliente.getContrasena());
            ps.setString(8, cliente.getFechaNacimiento());
            
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
    
    public int update(Cliente cliente){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(UPDATE);
            ps.setString(1, cliente.getNombreCliente());
            ps.setString(2, cliente.getApellidosCliente());
            ps.setString(3, cliente.getCorreoElectronico());
            ps.setString(4, cliente.getCelular());
            ps.setString(5, cliente.getAlias());
            ps.setInt(6, cliente.getContrasena());
            ps.setString(7, cliente.getFechaNacimiento());
            ps.setInt(8, cliente.getIdCliente());
            
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
    
    public int delete(Cliente cliente){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(DELETE);
            ps.setInt(1, cliente.getIdCliente());
            
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
    
    public List<Cliente> getClientesByApellido() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SELECT_APELLIDO);
            rs = ps.executeQuery();
            
            while (rs.next()){
                int idCliente = rs.getInt("id_clientes");
                String nombreCliente = rs.getString("nombres_cliente");
                String apellidosCliente = rs.getString("apellidos_cliente");
                String correoElectronico = rs.getString("correo_electronico");
                String celular = rs.getString("celular");
                String alias = rs.getString("alias");
                int contrasena = rs.getInt("contraseña");
                String fchaNacimiento = rs.getString("fecha_nacimiento");
                
                cliente = new Cliente(idCliente, nombreCliente, apellidosCliente, correoElectronico, celular, alias, contrasena, fchaNacimiento);
                
                clientes.add(cliente);
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
        
        return clientes;
    }
}
