/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ValidaLetras {
    
    public static void txtletras(java.awt.event.KeyEvent evt) {
            int k=(int)evt.getKeyChar();
            if (k >= 48 && k <= 58){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar Números !!!","Error en Dato",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    
}
