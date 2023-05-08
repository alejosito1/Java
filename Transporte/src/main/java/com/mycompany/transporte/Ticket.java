/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transporte;

import java.util.Date;

/**
 *
 * @author Sergio
 */
public class Ticket {
    private Date date;
    private Integer numPasajeros;
    private Boolean estadoTicket;
    private Sede sedeOrigen;
    private Sede sedeDestino;
    private Integer total;
    private Vehiculo vehiculo;

    public Ticket(Date date, Integer numPasajeros, Boolean estado, Sede sedeOrigen, Sede sedeDestino, Integer total, Vehiculo vehiculo) {
        this.date = date;
        this.numPasajeros = numPasajeros;
        this.estadoTicket = estado;
        this.sedeOrigen = sedeOrigen;
        this.sedeDestino = sedeDestino;
        this.total = total;
        this.vehiculo = vehiculo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public Boolean getEstado() {
        return estadoTicket;
    }

    public void setEstado(Boolean estado) {
        this.estadoTicket = estado;
    }

    public Sede getSedeOrigen() {
        return sedeOrigen;
    }

    public void setSedeOrigen(Sede sedeOrigen) {
        this.sedeOrigen = sedeOrigen;
    }

    public Sede getSedeDestino() {
        return sedeDestino;
    }

    public void setSedeDestino(Sede sedeDestino) {
        this.sedeDestino = sedeDestino;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}
