/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Iscariot
 */
public class Meja implements Restaurant {

    @Override
    public void Nama(String nama) {
        System.out.println("tamu");   
    }

    @Override
    public void NoMeja(String nomeja) {
        System.out.println("nomeja");   
    }

    @Override
    public void Makan() {
        System.out.println("makan"); 
    }

    @Override
    public void BookingMeja() {
        System.out.println("bookingmeja");  
    }

    @Override
    public void Bayar() {
        System.out.println("bayar");   
    }
    
}
