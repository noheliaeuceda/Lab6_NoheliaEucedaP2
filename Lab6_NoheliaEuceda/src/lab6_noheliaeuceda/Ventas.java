/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_noheliaeuceda;

import java.util.Date;

/**
 *
 * @author euced
 */
public class Ventas {
    private double totalVenta;
    private Date fechaVenta;

    public Ventas() {
    }

    public Ventas(double totalVenta, Date fechaVenta) {
        this.totalVenta = totalVenta;
        this.fechaVenta = fechaVenta;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    

    @Override
    public String toString() {
        return "Ventas{" + "totalVenta=" + totalVenta + ", fechaVenta=" + fechaVenta + '}';
    }
    
    
    
}
