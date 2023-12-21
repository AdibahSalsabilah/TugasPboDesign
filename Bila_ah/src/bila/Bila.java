/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bila;

/**
 *
 * @author ASUS
 */
public class Bila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BilaLogin lg = new BilaLogin();
            lg.setVisible(true);
            lg.pack();
            lg.setLocation(null);
            lg.setDefaultCloseOperation(BilaRegistrasi.EXIT_ON_CLOSE);
    }
    
}
