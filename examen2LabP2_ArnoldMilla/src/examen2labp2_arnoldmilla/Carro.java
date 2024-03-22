package examen2labp2_arnoldmilla;

import java.io.Serializable;


public class Carro implements Serializable{
    private int velocidad;
    private String modelo, marca;

    public Carro() {
    }

    public Carro(int velocidad, String modelo, String marca) {
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }  
}
