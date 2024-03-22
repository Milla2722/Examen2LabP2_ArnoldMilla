package examen2labp2_arnoldmilla;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class ProgressesBar extends Thread{
    private int velocidad;
    private JProgressBar bar;

    public ProgressesBar() {
    }

    public ProgressesBar(int velocidad, JProgressBar bar) {
        this.velocidad = velocidad;
        this.bar = bar;
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }
    
    @Override 
    public void run(){
        boolean continuar = true;
        bar.setMaximum(1000);
        int cont = 0;
        while(continuar){
            while(cont < bar.getMaximum()){
                if(cont >= bar.getMaximum()){
                    continuar = false;
                }
                else{
                    cont += velocidad;
                    bar.setValue(bar.getValue() + velocidad);
                }   
                try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressesBar.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
        }
    }
}
