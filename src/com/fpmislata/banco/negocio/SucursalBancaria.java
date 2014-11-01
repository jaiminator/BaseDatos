/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.negocio;

/**
 *
 * @author alumno
 */
public class SucursalBancaria {
    private int idSucursalBancaria;
    private String nombreSucursal;
    private String poblacion;
    private String codigoPostal;
    private String direccion;
    private String telefono;
    private String entidadBancaria;
    
    public SucursalBancaria () {
        
    }

    public SucursalBancaria(int idSucursalBancaria, String nombreSucursal, String poblacion, String codigoPostal, String direccion, String telefono, String entidadBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
        this.nombreSucursal = nombreSucursal;
        this.poblacion = poblacion;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.entidadBancaria = entidadBancaria;
    }

    public int getIdSucursalBancaria() {
        return idSucursalBancaria;
    }

    public void setIdSucursalBancaria(int idSucursalBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
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

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }
    
    
}
