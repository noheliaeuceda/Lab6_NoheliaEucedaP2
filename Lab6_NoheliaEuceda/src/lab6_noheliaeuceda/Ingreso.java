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

/**
 *
 * @author euced
 */
public class Ingreso {

    private ArrayList<Ventas> listaV = new ArrayList();
    private File archivo = null;
    public Ingreso(String path) {
        archivo = new File(path);
    }

    public void Agregar(Ventas v) {
        listaV.add(v);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ventas t : listaV) {
                bw.write("Venta total "+t.getTotalVenta() + " ");
                bw.write("Fecha Venta "+t.getFechaVenta() + " ");
                bw.flush();
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
        String salida = "";
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
