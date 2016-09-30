/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nit;

import forma.KlijentForma;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nadja
 */
public class NitPrijem extends Thread {

    BufferedReader in;
    KlijentForma forma;

    public NitPrijem(BufferedReader in, KlijentForma forma) {
        this.in = in;
        this.forma = forma;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String unos = in.readLine();
                forma.prijem(unos);
            }
        } catch (IOException ex) {
            System.out.println("Nit se gasi");
        }
    }
}
