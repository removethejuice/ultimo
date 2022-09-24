/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_p2_diegochavez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admincarros {
private static final long serie = 777L;
    private ArrayList<carros> listacarros = new ArrayList();
    private File archivo = new File("./admincarros.mb");

    public admincarros() {
    }

    public ArrayList<carros> getListacarros() {
        return listacarros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setListacarros(ArrayList<carros> listacarros) {
        this.listacarros = listacarros;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void leerArchivo() {
        try {
            listacarros = new ArrayList();
            carros temp;

            FileInputStream entrada
                    = new FileInputStream(archivo);
            ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
            try {
                while ((temp = (carros) objeto.readObject()) != null) {
                    listacarros.add(temp);
                }
            } catch (EOFException e) {
                //encontro el final del archivo
            }
            objeto.close();
            entrada.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }// fin de leer archivo

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (carros t : listacarros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }// fin de escribir
    
    
}
