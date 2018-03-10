/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_noheliaeuceda;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author euced
 */
public class Factura {
    private ArrayList<Producto> listaP= new ArrayList();
    private String email;
    private String nombre;
    private String RTN;
    private String CAI;
    private Date fecha;

    public Factura(String email, String nombre, String RTN, String CAI, Date fecha) {
        this.email = email;
        this.nombre = nombre;
        this.RTN = RTN;
        this.CAI = CAI;
        this.fecha = fecha;
    }

    public ArrayList<Producto> getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList<Producto> listaP) {
        this.listaP = listaP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getCAI() {
        return CAI;
    }

    public void setCAI(String CAI) {
        this.CAI = CAI;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "\t Dunkin Dunuts \t \n" +  " CAI=" + CAI +"\n"+ " fecha=" + fecha +"\n "+ "email=" + email + "\n nombre=" + nombre + "\n Productos "+ listaP+ "\n RTN=" + RTN ;
    }
    public void imprimeFactura(Component o, double s, double t){
        
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(o);
        FileWriter fw = null;
        BufferedWriter br = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals("Archivos de texto")) {
                    fichero = new File(jfc.getSelectedFile().getPath()+".txt");
                    
                }else{
                    fichero = jfc.getSelectedFile();
                    
                }
                fw = new FileWriter(fichero);
                br = new BufferedWriter(fw);
                br.write(this.toString()+"\n Subtotal="+s+"\n Total= "+t);
                br.flush();
                JOptionPane.showMessageDialog(o, "Archivo guardado exitosamente");
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                br.close();
                fw.close();
            } catch (IOException e) {
            }
        }
    }
    
}
