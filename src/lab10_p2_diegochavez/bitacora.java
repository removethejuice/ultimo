
package lab10_p2_diegochavez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class bitacora {
     private ArrayList<carros> c1 = new ArrayList();
      private File archivo = new File("./bitacora.txt");
      private carros tempc;
      private empleado tempe;
      private String estado;

    public bitacora() {
    }

    public bitacora(carros tempc, empleado tempe, String estado) {
        this.tempc = tempc;
        this.tempe = tempe;
        this.estado = estado;
    }

    public bitacora(carros tempc, empleado tempe) {
        this.tempc = tempc;
        this.tempe = tempe;
    }

    public void setTempc(carros tempc) {
        this.tempc = tempc;
    }

    public void setTempe(empleado tempe) {
        this.tempe = tempe;
    }

    public carros getTempc() {
        return tempc;
    }

    public empleado getTempe() {
        return tempe;
    }

    public ArrayList<carros> getC1() {
        return c1;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setC1(ArrayList<carros> c1) {
        this.c1 = c1;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "bitacora{" + "c1=" + c1 + ", archivo=" + archivo + '}';
    }
      
 public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (carros t : c1) {
                bw.write("La reparacion del carro   " + t.getID() + " por el empleado con Identidad:  " + tempe.getIdentidad()+"fue un :"+estado+"¨\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }      
      
     
}
