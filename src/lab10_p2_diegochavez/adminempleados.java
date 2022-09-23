
package lab10_p2_diegochavez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminempleados {
    private ArrayList<empleado> listaempleados = new ArrayList();
    private File archivo = new File("./adminempleados.mb");

    public adminempleados() {
    }

    public ArrayList<empleado> getListaempleados() {
        return listaempleados;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setListaempleados(ArrayList<empleado> listaempleados) {
        this.listaempleados = listaempleados;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public void leerArchivo() {
        try {
            listaempleados = new ArrayList();
            empleado temp;

            FileInputStream entrada
                    = new FileInputStream(archivo);
            ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
            try {
                while ((temp = (empleado) objeto.readObject()) != null) {
                    listaempleados.add(temp);
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
            for (empleado t : listaempleados) {
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
