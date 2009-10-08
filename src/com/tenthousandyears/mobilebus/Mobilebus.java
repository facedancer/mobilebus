/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenthousandyears.mobilebus;

import com.sun.lwuit.Display;
import com.sun.lwuit.Form;

/**
 * @author mateusz
 */
public class Mobilebus extends javax.microedition.midlet.MIDlet {

    public void startApp() {
        Display.init(this);
        Form mainForm = new Form("Envibus en temp reel");
        mainForm.show();
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
