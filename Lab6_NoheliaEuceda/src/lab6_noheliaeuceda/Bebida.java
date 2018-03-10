/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_noheliaeuceda;

/**
 *
 * @author euced
 */
public class Bebida extends Producto{
    private String esatdo;
    private double tamanio;
    private String tipo;

    public Bebida() {
    }

    public Bebida(String esatdo, double tamanio, String tipo, double precioCosto, double precioVenta, String nombre) {
        super(precioCosto, precioVenta, nombre);
        this.esatdo = esatdo;
        this.tamanio = tamanio;
        this.tipo = tipo;
    }

    public String getEsatdo() {
        return esatdo;
    }

    public void setEsatdo(String esatdo) {
        this.esatdo = esatdo;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bebida{" + "esatdo=" + esatdo + ", tamanio=" + tamanio + ", tipo=" + tipo + '}';
    }
    
    
    
}
