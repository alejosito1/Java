/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.transporte;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Main {
    public static List<Vehiculo> vehiculos = new ArrayList<>();
    public static List<Sede> sedes = new ArrayList<>();
    public static List<Ticket> tickets = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Integer opcion = 0;
        
        //Vehiculo
        Vehiculo vehiculo = null;
        String placa = "";
        String modelo = "";
        String color = "";
        Integer numAsientosPasajeros = 0;
        Boolean estadoVehiculo = true;
        String estadoVehiculoString = "En sede.";
        
        //Sede
        Sede sede = null;
        
        //Ticket
        Ticket ticket = null;
        Date date;
        Integer numPasajeros = 0;
        Boolean estadoTicket = true;
        Sede sedeOrigen = null;
        Sede sedeDestino = null;
        Integer totalTicket = 0;
        
        Boolean inicio = true;
        while(inicio){
            System.out.println("\nPUCALLPA EXPRESS S.A.C.");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Registrar nuevo vehiculo.");
            System.out.println("2. Registrar entrada.");
            System.out.println("3. Registrar salida.");
            System.out.println("4. Reporte de vehiculos por cada sede.");
            System.out.println("5. Reporte de vehiculos en ruta.");
            System.out.println("6. Reporte de total de ingresos por sede.");
            System.out.println("7. Salir");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1://Registrar nuevo vehiculo.
                    System.out.println("\nREGISTRAR NUEVO VEHICULO");
                    System.out.println("Ingrese número de placa:");
                    teclado.nextLine();
                    placa = teclado.nextLine();
                    
                    System.out.println("Ingrese modelo del vehículo:");
                    modelo = teclado.nextLine();
                    
                    System.out.println("Ingrese el color del vehiculo:");
                    color = teclado.nextLine();
                    
                    System.out.println("Ingrese el numero maximo de pasajeros del vehiculo:");
                    numAsientosPasajeros = teclado.nextInt();
                    
                    estadoVehiculo = true;
                    
                    System.out.println("Seleccione la sede en la que se encuentra el vehiculo:");
                    System.out.println("1. Tingo Maria.");
                    System.out.println("2. Aguaytia.");
                    System.out.println("3. Pucallpa.");
                    opcion = teclado.nextInt();
                    
                    switch(opcion){
                        case 1:
                            sede = Sede.TINGO;
                            break;
                            
                        case 2:
                            sede = Sede.AGUAYTIA;
                            break;
                            
                        case 3:
                            sede = Sede.PUCALLPA;
                            break;
                            
                    }
                    
                    vehiculo = new Vehiculo(placa, modelo, color, numAsientosPasajeros, estadoVehiculo, sede);
                    vehiculos.add(vehiculo);
                    
                    System.out.println("SE HA REGISTRADO NUEVO VEHICULO.");
                    break;
                    
                case 2://Registrar entrada.                    
                    int numeroVehiculo = 0;
                        if(vehiculos.isEmpty()){
                        System.out.println("\nREGISTRAR NUEVO VEHICULO");
                        System.out.println("Ingrese número de placa:");
                        teclado.nextLine();
                        placa = teclado.nextLine();

                        System.out.println("Ingrese modelo del vehículo:");
                        modelo = teclado.nextLine();

                        System.out.println("Ingrese el color del vehiculo:");
                        color = teclado.nextLine();

                        System.out.println("Ingrese el numero maximo de pasajeros del vehiculo:");
                        numAsientosPasajeros = teclado.nextInt();

                        estadoVehiculo = true;

                        System.out.println("Seleccione la sede en la que se encuentra el vehiculo:");
                        System.out.println("1. Tingo Maria.");
                        System.out.println("2. Aguaytia.");
                        System.out.println("3. Pucallpa.");
                        opcion = teclado.nextInt();

                        switch(opcion){
                            case 1:
                                sede = Sede.TINGO;
                                break;

                            case 2:
                                sede = Sede.AGUAYTIA;
                                break;

                            case 3:
                                sede = Sede.PUCALLPA;
                                break;
                        }

                        vehiculo = new Vehiculo(placa, modelo, color, numAsientosPasajeros, estadoVehiculo, sede);
                        vehiculos.add(vehiculo);
                        
                        System.out.println("SE HA REGISTRADO NUEVO VEHICULO.");
                    }//Termina el if.
                    else{
                            System.out.println("\nREGISTRAR NUEVA ENTRADA");
                            //------------------------------------------ESTADO DEL TICKET -----------------------------------------------
                            estadoTicket = true;
                            numPasajeros = 0;
                            
                            //-----------------------------------------SEDE ORIGEN-------------------------------------------------------
                            System.out.println("Seleccione la sede en la que se encuentra:");
                            opcion = teclado.nextInt();
                            switch(opcion){
                                case 1:
                                    sedeOrigen = Sede.TINGO;
                                    break;

                                case 2:
                                    sedeOrigen = Sede.AGUAYTIA;
                                    break;

                                case 3:
                                    sedeOrigen = Sede.PUCALLPA;
                                    break;
                            }
                            //---------------------------------------SEDE DESTINO--------------------------------------------------------
                            
                            System.out.println("Seleccione la sede de donde viene.");
                            if(sedeOrigen.getId()== 0){
                                System.out.println("2. Aguaytia.");
                                System.out.println("3. Pucallpa.");
                            }else if(sedeOrigen.getId() == 1){
                                System.out.println("1. Tingo Maria.");
                                System.out.println("3. Pucallpa.");
                            }else if(sedeOrigen.getId() == 2){
                                System.out.println("1. Tingo Maria");
                                System.out.println("2. Aguaytia");
                            }else{
                                System.out.println("No ha elegido un sede.");
                            }
                            opcion = teclado.nextInt(); 
                            
                            switch(opcion){
                                case 1:
                                    sedeDestino = Sede.TINGO;
                                    break;

                                case 2:
                                    sedeDestino = Sede.AGUAYTIA;
                                    break;

                                case 3:
                                    sedeDestino = Sede.PUCALLPA;
                                    break;
                            }
                            //-------------------------------TOTAL TICKET------------------------------------------------------------
                            totalTicket = 0;
                            //------------------------------SELECCION DE VEHICULO---------------------------------------------------
                            System.out.println("Seleccione el vehiculo de la sede "+ sedeDestino.getNombre());
                            
                            for(int i=0; i<vehiculos.size() ; i++){
                                if(vehiculos.get(i).getSedeVehiculo().getId() == sedeDestino.getId() && vehiculos.get(i).getEstado() == false){
                                    estadoVehiculoString = "En transito.";
                                    System.out.println(i + " --> PLACA: " +vehiculos.get(i).getPlaca()+", MODELO: "+vehiculos.get(i).getModelo()
                                                        +", COLOR: " +vehiculos.get(i).getColor()+ ", ESTADO: "+estadoVehiculoString);
                                }//Termina if.
                                else{
                                    System.out.println("No existen vehículos en ruta de la sede " + sedeDestino.getNombre());
                                    System.out.println("Comuniquese la sede "+sedeDestino.getNombre());
                                    break;
                                }
                            }//Termina For.
                            numeroVehiculo = teclado.nextInt();
                            vehiculo = vehiculos.get(numeroVehiculo);
                            
                            date = Date.from(Instant.now());
                            
                            ticket = new Ticket(date, numPasajeros, estadoTicket, sedeOrigen, sedeDestino, totalTicket, vehiculo);
                            tickets.add(ticket);
                            vehiculos.get(numeroVehiculo).setEstado(true);
                            vehiculos.get(numeroVehiculo).setSedeVehiculo(sedeOrigen);
                            
                            System.out.println("SE HA REGISTRADO EL TICKET DE ENTRADA.");
                            
                            System.out.println("PUCALLPA EXPRESS S.A.C. - SEDE "+ sedeOrigen.getNombre());
                            System.out.println("\nTicket numero: " + (tickets.size()-1));
                            System.out.println("FECHA Y HORA: " + date);
                            System.out.println("SEDE DE ORIGEN: "+ sedeDestino.getNombre());
                            System.out.println("VEHICULO: PLACA "+vehiculo.getPlaca()+", MODELO: "+vehiculo.getModelo()+", COLOR: "+vehiculo.getColor());
                            
                    }//Termina else.
                    break;
                    
                case 3://Registrar salida.                    
                    numeroVehiculo = 0;
                        if(vehiculos.isEmpty()){
                        System.out.println("\nREGISTRAR NUEVO VEHICULO");
                        System.out.println("Ingrese número de placa:");
                        teclado.nextLine();
                        placa = teclado.nextLine();

                        System.out.println("Ingrese modelo del vehículo:");
                        modelo = teclado.nextLine();

                        System.out.println("Ingrese el color del vehiculo:");
                        color = teclado.nextLine();

                        System.out.println("Ingrese el numero maximo de pasajeros del vehiculo:");
                        numAsientosPasajeros = teclado.nextInt();

                        estadoVehiculo = true;

                        System.out.println("Seleccione la sede en la que se encuentra el vehiculo:");
                        System.out.println("1. Tingo Maria.");
                        System.out.println("2. Aguaytia.");
                        System.out.println("3. Pucallpa.");
                        opcion = teclado.nextInt();

                        switch(opcion){
                            case 1:
                                sede = Sede.TINGO;
                                break;

                            case 2:
                                sede = Sede.AGUAYTIA;
                                break;

                            case 3:
                                sede = Sede.PUCALLPA;
                                break;
                        }

                        vehiculo = new Vehiculo(placa, modelo, color, numAsientosPasajeros, estadoVehiculo, sede);
                        vehiculos.add(vehiculo);
                        
                        System.out.println("SE HA REGISTRADO NUEVO VEHICULO.");
                    }//Termina el if.
                    else{
                            System.out.println("\nREGISTRAR NUEVA SALIDA");
                            //------------------------------------------ESTADO DEL TICKET -----------------------------------------------
                            estadoTicket = false;
                            
                            //-----------------------------------------SEDE ORIGEN-------------------------------------------------------
                            System.out.println("Seleccione la sede en la que se encuentra:");
                            opcion = teclado.nextInt();
                            switch(opcion){
                                case 1:
                                    sedeOrigen = Sede.TINGO;
                                    break;

                                case 2:
                                    sedeOrigen = Sede.AGUAYTIA;
                                    break;

                                case 3:
                                    sedeOrigen = Sede.PUCALLPA;
                                    break;
                            }
                            //---------------------------------------SEDE DESTINO--------------------------------------------------------
                            
                            System.out.println("Seleccione la sede a donde se dirige.");
                            if(sedeOrigen.getId()== 0){
                                System.out.println("2. Aguaytia.");
                                System.out.println("3. Pucallpa.");
                            }else if(sedeOrigen.getId() == 1){
                                System.out.println("1. Tingo Maria.");
                                System.out.println("3. Pucallpa.");
                            }else if(sedeOrigen.getId() == 2){
                                System.out.println("1. Tingo Maria");
                                System.out.println("2. Aguaytia");
                            }else{
                                System.out.println("No ha elegido un sede.");
                            }
                            opcion = teclado.nextInt(); 
                            
                            switch(opcion){
                                case 1:
                                    sedeDestino = Sede.TINGO;
                                    break;

                                case 2:
                                    sedeDestino = Sede.AGUAYTIA;
                                    break;

                                case 3:
                                    sedeDestino = Sede.PUCALLPA;
                                    break;
                            }
                            //-----------------------------------------------NUMERO DE PASAJEROS----------------------------
                            boolean continuarPasajero = true;
                            
                            while(continuarPasajero){
                                System.out.println("Seleciones la cantidad de pasajeros");
                                System.out.println("1. 3 pasajeros.");
                                System.out.println("2. 4 pasajeros.");
                                int opcionPasajeros = teclado.nextInt();
                                switch(opcionPasajeros){
                                    case 1://3 pasajeros
                                        numPasajeros = 3;
                                        continuarPasajero = false;
                                        break;

                                    case 2://4 pasajeros
                                        numPasajeros = 4;
                                        continuarPasajero = false;
                                        break;

                                    default:
                                        System.out.println("La cantidad minima de pasajeros debe ser 3 y 4 como máximo.");
                                        break;
                                }//Termina Switch
                            }//Termina While
                            
                            //-------------------------------TOTAL TICKET------------------------------------------------------------
                            Integer precioTicket = 0;
                            if(sedeOrigen.getId() == 0 && sedeDestino.getId() == 2){
                                precioTicket = 60;
                            } else if(sedeOrigen.getId() == 2 && sedeDestino.getId() == 0){
                                precioTicket = 60;
                            } else{
                                precioTicket = 30;
                            }
                            
                            totalTicket = precioTicket * numPasajeros;
                            
                            //------------------------------SELECCION DE VEHICULO---------------------------------------------------
                            System.out.println("Seleccione el vehiculo de la sede "+ sedeOrigen.getNombre());
                            
                            for(int i=0; i<vehiculos.size() ; i++){
                                if(vehiculos.get(i).getSedeVehiculo().getId() == sedeOrigen.getId() && vehiculos.get(i).getEstado() == true){
                                    estadoVehiculoString = "En sede.";
                                    System.out.println(i + " --> PLACA: " +vehiculos.get(i).getPlaca()+", MODELO: "+vehiculos.get(i).getModelo()
                                                        +", COLOR: " +vehiculos.get(i).getColor()+ ", ESTADO: "+estadoVehiculoString);
                                }//Termina if.
                                else{
                                    System.out.println("No existen vehículos en ruta de la sede " + sedeOrigen.getNombre());
                                    System.out.println("Comuniquese la sede "+sedeOrigen.getNombre());
                                    break;
                                }
                            }//Termina For.
                            numeroVehiculo = teclado.nextInt();
                            vehiculo = vehiculos.get(numeroVehiculo);
                            
                            date = Date.from(Instant.now());
                            
                            ticket = new Ticket(date, numPasajeros, estadoTicket, sedeOrigen, sedeDestino, totalTicket, vehiculo);
                            tickets.add(ticket);
                            vehiculos.get(numeroVehiculo).setEstado(false);
                            vehiculos.get(numeroVehiculo).setSedeVehiculo(sedeOrigen);
                            
                            System.out.println("SE HA REGISTRADO EL TICKET DE SALIDA.");
                            
                            System.out.println("\nPUCALLPA EXPRESS S.A.C. - SEDE "+ sedeOrigen.getNombre());
                            System.out.println("Ticket numero: " + (tickets.size()-1));
                            System.out.println("FECHA Y HORA: " + date);
                            System.out.println("SEDE DE DESTINO: "+ sedeDestino.getNombre());
                            System.out.println("VEHICULO: PLACA "+vehiculo.getPlaca()+", MODELO: "+vehiculo.getModelo()+", COLOR: "+vehiculo.getColor());
                            
                    }//Termina else.
                    break;
                    
                case 4://Reporte de vehiculos por cada sede
                    System.out.println("\nREPORTE DE VEHICULOS POR SEDE:");
                    for(int i = 0; i<sedes.size() ; i++){
                        System.out.println("REPORTE DE VEHICULOS DE LA SEDE " + sedes.get(i).getNombre());
                        for(int v = 0; v < vehiculos.size() ; v++){
                            if(sedes.get(i).getId() == vehiculos.get(v).getSedeVehiculo().getId()){
                                System.out.println(i + " --> PLACA: " +vehiculos.get(v).getPlaca()+", MODELO: "+vehiculos.get(v).getModelo()
                                                    +", COLOR: " +vehiculos.get(v).getColor()+ ", ESTADO: "+estadoVehiculoString);
                            }
                        }
                    }
                    
                    break;
                    
                case 5://Reporte de vehiculos en ruta
                    System.out.println("\nREPORTE DE VEHICULOS EN RUTA:");
                    for(int i =0; i< vehiculos.size(); i++){
                        if(vehiculos.get(i).getEstado() == false){
                            System.out.println(i + " --> PLACA: " +vehiculos.get(i).getPlaca()+", MODELO: "+vehiculos.get(i).getModelo()
                                                +", COLOR: " +vehiculos.get(i).getColor()+ ", ESTADO: "+estadoVehiculoString);
                        }
                    }
                    break;
                    
                case 6://Reporte de total de ingresos por sede
                    System.out.println("\nREPORTE TOTAL DE INGRESOS POR SEDE:");
                    Integer totalIngreso = 0;
                    for(int i=0; i<sedes.size(); i++){
                        totalIngreso = 0;
                        for(int t =0; t<tickets.size(); t++){
                            if(sedes.get(i).getId() == tickets.get(t).getSedeOrigen().getId() && tickets.get(t).getEstado()==false){
                                totalIngreso = totalIngreso + tickets.get(t).getTotal();
                            }
                        }
                        System.out.println("TOTAL DE INGRESOS DE LA SEDE: "+sedes.get(i).getNombre());
                    }
                    
                    break;
                
                case 7://Salir
                    inicio = false;
                    break;
                
                default:
                    System.out.println("No ha elegido una opcion valida.");
                    break;
            }//Termina Switch
            
        }//Terminar While.
    }//Termina Public static void
}//Termina Public class