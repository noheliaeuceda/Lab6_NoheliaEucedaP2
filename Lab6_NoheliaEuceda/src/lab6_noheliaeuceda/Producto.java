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
public class Producto {
    protected double precioCosto;
    protected double precioVenta;
    protected String nombre;

    public Producto() {
    }

    public Producto(double precioCosto, double precioVenta, String nombre) {
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.nombre = nombre;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "precioCosto=" + precioCosto + ", precioVenta=" + precioVenta + ", nombre=" + nombre + '}';
    }
    
    
}
