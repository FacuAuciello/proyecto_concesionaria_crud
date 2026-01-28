
package com.mycompany.concesionario.logica;

public class Automovil {
    
    private int id;
    private String marca;
    private String modelo;
    private int kms;
    private String motor;
    private String patente;
    private String color;
    private int cantidadPuertas;

    public Automovil() {
    }

    public Automovil(int id, String marca, String modelo, int kms, String motor, String patente, String color, int cantidadPuertas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kms = kms;
        this.motor = motor;
        this.patente = patente;
        this.color = color;
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
    
}
