/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class ValidaNumeros {
    
    public static void txtnumero(java.awt.event.KeyEvent evt) {
            int k=(int)evt.getKeyChar();
            if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            }
            if(k==241 || k==209 || k>=91 && k<=96 || k>=123 && k<=255 || k>=32 && k<=45 || k==47 || k>=58 && k<=64){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar Caracteres especiales!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            }
        }

    public static void txtentero(java.awt.event.KeyEvent evt) {
            int k=(int)evt.getKeyChar();
            if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar Letras !!!","Error en Dato",JOptionPane.ERROR_MESSAGE);
            }
            if(k==241 || k==209 || k>=91 && k<=96 || k>=123 && k<=255 || k>=32 && k<=45 || k==47 || k>=58 && k<=64){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"No puede ingresar Caracteres Especiales !!!","Error en Datos",JOptionPane.ERROR_MESSAGE);
            }
            if(k==46){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este Campo es un Número Entero !!!","Error en Datos",JOptionPane.ERROR_MESSAGE);
            }
    }
    
}
