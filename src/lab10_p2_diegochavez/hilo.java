package lab10_p2_diegochavez;

import javax.swing.JProgressBar;

public class hilo implements Runnable {

    private JProgressBar barra;
    private carros elegido;

    public hilo(JProgressBar barra,carros elegido) {
        this.barra = barra;
        this.elegido = elegido;
    }

    public hilo() {
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (barra.getValue() < barra.getMaximum()) {
            barra.setValue(barra.getValue() + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
         
    }
}
