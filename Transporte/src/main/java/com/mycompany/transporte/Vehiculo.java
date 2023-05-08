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
public class Vehiculo {
    private String placa;
    private String modelo;
    private String color;
    private Integer numAsientosPasajeros;
    private Boolean estado; //True(En sede), False(En transito)
    private Sede sede;

    public Vehiculo(String placa, String modelo, String color, Integer numAsientosPasajeros, Boolean estado, Sede sede) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.numAsientosPasajeros = numAsientosPasajeros;
        this.estado = estado;
        this.sede = sede;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumAsientosPasajeros() {
        return numAsientosPasajeros;
    }

    public void setNumAsientosPasajeros(Integer numAsientosPasajeros) {
        this.numAsientosPasajeros = numAsientosPasajeros;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Sede getSedeVehiculo() {
        return sede;
    }

    public void setSedeVehiculo(Sede sedeVehiculo) {
        this.sede = sedeVehiculo;
    }
    
    
}
