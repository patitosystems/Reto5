package datos;

import entity.MotociletaElectrica;
import java.sql.*;
import java.util.*;

/**
 *
 * @author PatitoSystems
 */
public class MotocicletaElectricaDAO {
    
    private static final String SELECT_JOIN = "SELECT m.id_motocicleta, m.fabricante_motocicleta, m.precio_unitario, m.autonomia_bateria, m.id_proveedor_motor, p.nombre_proveedor FROM motocicleta_electrica m INNER JOIN proveedor p on m.id_proveedor_motor = p.id_proveedor WHERE p.nombre_proveedor = 'Auteco'";

    
    private static final String SELECT = "SELECT m.id_motocicleta, m.fabricante_motocicleta, m.precio_unitario, m.autonomia_bateria, m.id_proveedor_motor FROM motocicleta_electrica m";
    private static final String INSERT = "INSERT INTO motocicleta_electrica (fabricante_motocicleta,precio_unitario,autonomia_bateria,id_proveedor_motor) VALUES (?,?,?,?)";
    private static final String UPDATE = "UPDATE motocicleta_electrica SET fabricante_motocicleta = ? ,precio_unitario = ? ,autonomia_bateria = ? ,id_proveedor_motor = ? WHERE id_motocicleta = ?";
    private static final String DELETE = "DELETE FROM motocicleta_electrica WHERE id_motocicleta = ?";
    
    public List<MotociletaElectrica> getMotocicletas() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        MotociletaElectrica motocicletaElectrica = null;
        List<MotociletaElectrica> motocicletasElectricas = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SELECT);
            rs = ps.executeQuery();
            
            while (rs.next()){
                int idMotocicleta = rs.getInt("id_motocicleta");
                String fabricanteMotocicleta = rs.getString("fabricante_motocicleta");
                int precioUnitario = rs.getInt("precio_unitario");
                String autonomiaBateria = rs.getString("autonomia_bateria");
                int idProveedorMotor = rs.getInt("id_proveedor_motor");
                
                motocicletaElectrica = new MotociletaElectrica(idMotocicleta, fabricanteMotocicleta, precioUnitario, autonomiaBateria, idProveedorMotor);
                
                motocicletasElectricas.add(motocicletaElectrica);
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
        
        return motocicletasElectricas;
    }
    
    public int insert(MotociletaElectrica motocicletaE){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(INSERT);
            ps.setString(1, motocicletaE.getFabricanteMotocicleta());
            ps.setInt(2, motocicletaE.getPrecioUnitario());
            ps.setString(3, motocicletaE.getAutonomiaBateria());
            ps.setInt(4, motocicletaE.getIdProveedorMotor());
            
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
    
    public int update(MotociletaElectrica motoE){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(UPDATE);
            ps.setString(1, motoE.getFabricanteMotocicleta());
            ps.setInt(2, motoE.getPrecioUnitario());
            ps.setString(3, motoE.getAutonomiaBateria());
            ps.setInt(4, motoE.getIdProveedorMotor());
            ps.setInt(5, motoE.getIdMotocicleta());
            
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
    
    public int delete(MotociletaElectrica motoE){
        
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(DELETE);
            ps.setInt(1, motoE.getIdMotocicleta());
            
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
    
    
    
    public List<MotociletaElectrica> getMotocicletasByProveedor() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        MotociletaElectrica motocicletaElectrica = null;
        List<MotociletaElectrica> motocicletasElectricas = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SELECT_JOIN);
            rs = ps.executeQuery();
            
            while (rs.next()){
                
                String fabricanteMotocicleta = rs.getString("fabricante_motocicleta");
                
                motocicletaElectrica = new MotociletaElectrica(fabricanteMotocicleta);
                
                motocicletasElectricas.add(motocicletaElectrica);
                
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
        
        return motocicletasElectricas;
    }
    
}
