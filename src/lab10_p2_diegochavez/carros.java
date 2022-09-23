 
package lab10_p2_diegochavez;

public class carros {
    
    private String marca;
    private String modelo;
    private int anio;
    private String estado;
    private int costo;
    private String ID;

    public carros(String marca, String modelo, int anio, String estado, int costo, String ID) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.estado = estado;
        this.costo = costo;
        this.ID = ID;
    }



    public carros() {
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getEstado() {
        return estado;
    }

    public int getCosto() {
        return costo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "carros{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", estado=" + estado + ", costo=" + costo + '}';
    }
    
}
