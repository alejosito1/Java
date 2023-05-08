/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transporte;

/**
 *
 * @author Sergio
 */
public enum Sede {
    TINGO(0,"Tingo Maria", 5),
    AGUAYTIA(1,"Aguaytia", 5),
    PUCALLPA(2,"Pucallpa", 5);
    
    private Integer id;
    private String nombre;
    private Integer precio;
    private Integer numVehiculos;

    private Sede(Integer id,String nombre, Integer numVehiculos) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.numVehiculos = numVehiculos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumVehiculos() {
        return numVehiculos;
    }

    public void setNumVehiculos(Integer numVehiculos) {
        this.numVehiculos = numVehiculos;
    }
    
    
}
