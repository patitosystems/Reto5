package test;

import datos.MotocicletaElectricaDAO;
import entity.MotociletaElectrica;
import java.util.List;

/**
 *
 * @author PatitoSystems
 */
public class TestMotoE {
    
    public static void main(String[] args) {

        MotocicletaElectricaDAO motoEDAO = new MotocicletaElectricaDAO();
        // select
//        
//        List<MotociletaElectrica> motos = motoEDAO.getMotocicletas();
//
//        for (MotociletaElectrica moto: motos) {
//            System.out.println("Moto Electrica = " + moto);
//        }

        // insert
//        MotociletaElectrica motoE = new MotociletaElectrica("Ducati", 600000, "combustion xD", 3);
//        motoEDAO.insert(motoE);
//        
//        List<MotociletaElectrica> motos = motoEDAO.getMotocicletas();
//
//        for (MotociletaElectrica mototInserted : motos) {
//            System.out.println("Moto Electrica = " + mototInserted);
//        }
        
        // update
        
//        MotociletaElectrica moto = new MotociletaElectrica(7, "Mucati", 600000, "2 horas", 3);
//        motoEDAO.update(moto);
//
//        List<MotociletaElectrica> motos = motoEDAO.getMotocicletas();
//
//        for (MotociletaElectrica motoUpdated : motos) {
//            System.out.println("Motos = " + motoUpdated);
//        }


        // delete
//        MotociletaElectrica moto = new MotociletaElectrica(7);
//        motoEDAO.delete(moto);
//
//        List<MotociletaElectrica> motos = motoEDAO.getMotocicletas();
//
//        for (MotociletaElectrica motoDeleted : motos) {
//            System.out.println("MOTO = " + motoDeleted);


  //      }
        // SELECT JOIN
        List<MotociletaElectrica> motos = motoEDAO.getMotocicletasByProveedor();

        for (MotociletaElectrica moto : motos) {
            System.out.println("moto = " + moto.getNombreProveedor());
        }
    }
}
