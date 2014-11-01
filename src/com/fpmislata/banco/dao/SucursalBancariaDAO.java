/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco.dao;

import com.fpmislata.banco.negocio.SucursalBancaria;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface SucursalBancariaDAO {
    
    void delete(int idSucursalBancaria);
    void insert(SucursalBancaria sucursalBancaria);
    void update(SucursalBancaria sucursalBancaria);
    List<SucursalBancaria> findAll();
    void find(SucursalBancaria sucursalBancaria);
    
}
