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
public class Comida extends Producto{
    private String tipo;

    public Comida() {
    }

    public Comida(String tipo, double precioCosto, double precioVenta, String nombre) {
        super(precioCosto, precioVenta, nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Comida{" + "tipo=" + tipo + '}';
    }
    
}
