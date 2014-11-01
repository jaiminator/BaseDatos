/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fpmislata.banco.negocio.EntidadBancaria;
import com.fpmislata.banco.jdbc.EntidadBancariaDAOImplJDBC;
import com.fpmislata.banco.negocio.SucursalBancaria;
import com.fpmislata.banco.jdbc.SucursalBancariaDAOImplJDBC;
import com.fpmislata.banco.json.JsonTransformer;
import com.fpmislata.banco.json.JsonTransformerImplJackson;
import java.util.List;

/**
 *
 * @author alumno
 */
public class BaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREACION DEL OBJETO PARA LLAMAR A LAS FUNCIONES DE LA CLASE 'EntidadBancaria'
//            EntidadBancaria entidadBancaria = new EntidadBancaria();
//            entidadBancaria.setIdEntidadBancaria(7);
//            entidadBancaria.setNombre("santander");
//            entidadBancaria.setCodigoEntidad("00" + entidadBancaria.getIdEntidadBancaria());
//            entidadBancaria.setFechaCreacion(null);
        
        //CREACIÓN DEL OBJETO PARA LLAMAR A LAS FUNCIONES DE LA CLASE 'EntidadBancariaDAO'
//            EntidadBancariaDAOImplJDBC entidadBancariaDAO = new EntidadBancariaDAOImplJDBC();
        
        //BORRAR UNA FILA CONCRETA DE LA TABLA 'entidadBancaria'
//            entidadBancariaDAO.delete(4);
        //INSERTAR UNA FILA CONCRETA DE LA TABLA 'entidadBancaria'
//            entidadBancariaDAO.insert(entidadBancaria);
//            entidadBancaria.setNombre("bankia");
//        MODIFICAR UNA FILA CONCRETA DE LA TABLA 'entidadBancaria'
//            entidadBancariaDAO.update(entidadBancaria);
        //MOSTRAR TODOS LOS REGISTROS O FILAS DE LA BASE DE DATOS
//            List<EntidadBancaria> entidadesBancarias;
//            
//            entidadesBancarias = entidadBancariaDAO.findAll();
//
//            
//            System.out.println("IdEntidadBancaria    Nombre    CodigoEntidad   FechaCreacion" );
//            System.out.println("");
//            
//            for (EntidadBancaria entidadBancaria: entidadesBancarias) {
//                System.out.println(entidadBancaria.getIdEntidadBancaria() + "                    " + entidadBancaria.getNombre() +
//                        "       " + entidadBancaria.getCodigoEntidad() + "          " + entidadBancaria.getFechaCreacion());
//            }
        //MOSTRAR TODOS LOS REGISTROS O FILAS DE LA BASE DE DATOS
//        EntidadBancaria entidadBancaria = entidadBancariaDAO.get(6);
//        
//        System.out.println(entidadBancaria.getIdEntidadBancaria() + "   " 
//                + entidadBancaria.getNombre() + "   "
//                + entidadBancaria.getCodigoEntidad() + "    " 
//                + entidadBancaria.getFechaCreacion());
        
//            SucursalBancaria sucursalBancaria = new SucursalBancaria();
//            sucursalBancaria.setIdSucursalBancaria(5);
//            sucursalBancaria.setNombreSucursal("santander");
//            sucursalBancaria.setPoblacion("mislata");
//            sucursalBancaria.setCodigoPostal("46920");
//            sucursalBancaria.setDireccion("Av. del Sud");
//            sucursalBancaria.setTelefono("968826431");
//            sucursalBancaria.setEntidadBancaria("007");
//            
//            SucursalBancariaDAOImplJDBC sucursalBancariaDAO = new SucursalBancariaDAOImplJDBC();
//            sucursalBancariaDAO.delete(5);
        
//        JSON TRANSFORM
        
        JsonTransformer jsonTransformer = new JsonTransformerImplJackson();
        
        EntidadBancaria entidadBancaria = new EntidadBancaria(4, "santander", "004", null);
        String jsonEntidad = jsonTransformer.toJson(entidadBancaria);
        
        System.out.println(jsonEntidad);
        System.out.println("");
        
        EntidadBancaria newEntidadBancaria=(EntidadBancaria) jsonTransformer.fromJson(jsonEntidad, EntidadBancaria.class);
        
        System.out.println("IdEntidadBancaria: " + newEntidadBancaria.getIdEntidadBancaria());
        System.out.println("Nombre: " + newEntidadBancaria.getNombre());
        System.out.println("CodigoEntidad: " + newEntidadBancaria.getCodigoEntidad());
        System.out.println("FechaCreacion: " + newEntidadBancaria.getFechaCreacion());
    }
    
}
