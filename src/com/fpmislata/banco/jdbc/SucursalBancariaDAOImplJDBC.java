package com.fpmislata.banco.jdbc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.fpmislata.banco.dao.SucursalBancariaDAO;
import com.fpmislata.banco.negocio.SucursalBancaria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class SucursalBancariaDAOImplJDBC implements SucursalBancariaDAO {
    
    
    @Override
    public void delete (int idSucursalBancaria) {
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_bancario","root", "root");
            String deleteTableSQL = "DELETE FROM sucursalBancaria WHERE idSucursalBancaria = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(deleteTableSQL);
            preparedStatement.setInt(1, idSucursalBancaria);

            //EJECUTAR LA CONSULTA DELETE
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            throw new RuntimeException("ERROR AL BORRAR EL REGISTRO", ex);
        }
        
    }    
    
    
    @Override
    public void insert(SucursalBancaria sucursalBancaria) {
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_bancario","root", "root");
            String insertTableSQL = "INSERT INTO sucursalBancaria VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conn.prepareStatement(insertTableSQL);
            preparedStatement.setInt(1, sucursalBancaria.getIdSucursalBancaria());
            preparedStatement.setString(2, sucursalBancaria.getNombreSucursal());
            preparedStatement.setString(3, sucursalBancaria.getCodigoPostal());
            preparedStatement.setString(4, sucursalBancaria.getPoblacion());
            preparedStatement.setString(5, sucursalBancaria.getDireccion());
            preparedStatement.setString(6, sucursalBancaria.getTelefono());
            preparedStatement.setString(7, sucursalBancaria.getEntidadBancaria());

            //EJECUTAR LA CONSULTA INSERT
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            throw new RuntimeException("ERROR AL INSERTAR REGISTRO", ex);
        }
        
    }
    
    
    @Override
    public void update(SucursalBancaria sucursalBancaria) {
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_bancario","root", "root");
            String updateTableSQL = "UPDATE sucursalBancaria SET nombreSucursal = ?  WHERE idSucursalBancaria = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(updateTableSQL);
            preparedStatement.setString(1, sucursalBancaria.getNombreSucursal());
            preparedStatement.setInt(2, sucursalBancaria.getIdSucursalBancaria());

            //EJECUTAR LA CONSULTA UPDATE
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            throw new RuntimeException("ERROR AL MODIFICAR REGISTRO", ex);
        }
        
    }
    
    
    @Override
    public List<SucursalBancaria> findAll() {
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_bancario","root", "root");
            String selectSQL = "SELECT * FROM sucursalBancaria";

            PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
            ResultSet rs = preparedStatement.executeQuery(selectSQL );

            List<SucursalBancaria> sucursalesBancariasList = new ArrayList<>();

            while (rs.next()) {
                SucursalBancaria sucursalBancaria = new SucursalBancaria();
                sucursalBancaria.setIdSucursalBancaria(rs.getInt("idSucursalBancaria"));
                sucursalBancaria.setNombreSucursal(rs.getString("nombreSucursal"));
                sucursalBancaria.setPoblacion(rs.getString("poblacion"));
                sucursalBancaria.setCodigoPostal(rs.getString("codigoPostal"));
                sucursalBancaria.setDireccion(rs.getString("direccion"));
                sucursalBancaria.setTelefono(rs.getString("telefono"));
                sucursalBancaria.setEntidadBancaria(rs.getString("entidadBancaria"));

                sucursalesBancariasList.add(sucursalBancaria);
            }
            return sucursalesBancariasList;
        } catch (Exception ex) {
            throw new RuntimeException("ERROR AL MOSTRAR LISTA DE REGISTROS", ex);
        }
        
    }
    
    
    @Override
    public void find(SucursalBancaria sucursalBancaria) {
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_bancario","root", "root");
            String selectParcialSQL = "SELECT * FROM sucursalBancaria WHERE nombreSucursal = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(selectParcialSQL);
            preparedStatement.setString(1, sucursalBancaria.getNombreSucursal());
            ResultSet rs = preparedStatement.executeQuery(selectParcialSQL);

            System.out.println("ID_SUCURSAL_BANCARIA" + "    " + "NOMBRE_SUCURSAL" + "    " + "POBLACION" + "    " 
                    + "CODIGO_POSTAL" + "       " + "DIRECCION" + "      " + "TELEFONO" + "      " + "ENTIDAD_BANCARIA");
            while (rs.next()) {
                System.out.println(rs.getInt("idSucursalBancaria") + "                      " 
                    + rs.getString(rs.getString("nombreSucursal")) + "       " + rs.getString("poblacion") + "           " 
                    + rs.getString("codigoPostal") + "          " + rs.getString("direccion") 
                    + "          " + rs.getString("telefono") + "          " + rs.getString("entidadBancaria"));
            }
        } catch (Exception ex) {
            throw new RuntimeException("ERROR AL MOSTRAR REGISTRO", ex);
        }
        
    }
    
    private static java.sql.Timestamp getCurrentTimeStamp() {
 
        java.util.Date today = new java.util.Date();
        return new java.sql.Timestamp(today.getTime());
 
    }
    
}
