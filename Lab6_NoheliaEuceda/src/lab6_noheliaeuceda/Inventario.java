/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_noheliaeuceda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author euced
 */
public class Inventario {

    ArrayList<Producto> lista = new ArrayList();
    private File archivo = null;

    public Inventario(String path) {
        archivo = new File(path);
    }

    public void agregar(Producto p) {
        lista.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Producto t : lista) {
                if (t instanceof Bebida) {
                    bw.write(t.getNombre() + " ");
                    bw.write(" Tamaño "+((Bebida) t).getTamanio());
                    bw.write(" Precio de Costo  "+t.getPrecioCosto());
                    bw.write(" Precio de Venta "+t.getPrecioVenta());
                    bw.write(" Tipo "+((Bebida) t).getTipo());
                    bw.write(" Estado "+((Bebida) t).getEsatdo());
                    bw.write("\n");
                    bw.flush();
                } else if (t instanceof Comida) {
                    bw.write(t.getNombre() + ";");
                    bw.write(t.getPrecioCosto() + ";");
                    bw.write(t.getPrecioVenta() + ";");
                    bw.write("Tipo " +((Comida) t).getTipo());
                    bw.write("\n");
                    bw.flush();
                }

            }
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public String cargarArchivo() {
        // TODO add your handling code here:

        FileReader fr = null;
        BufferedReader br = null;
        String salida = "Productos: \n";
        if (archivo.exists()) {
            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;

                while ((linea = br.readLine()) != null) {
                    salida = salida.concat(linea);
                    salida = salida.concat("\n");
                }
                System.out.println(salida);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
            }
        }
        return salida;
    }

}
