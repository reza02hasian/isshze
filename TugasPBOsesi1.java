/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Infinix
 */
import javax.swing.JOptionPane;
public class TugasPBOsesi1 {
    
    public static void main(String[] args) {
        
        //Nomer 1
        System.out.println("Belajar JAVA");
        System.out.println("Sangat Mudah Sekali");
        System.out.println("dan Juga Sangat Menyenangkan");
        
        //Nomor 2
        String respon;
        respon = JOptionPane.showInputDialog("Anda sedang belajar apa?");
        
        JOptionPane.showMessageDialog(null, "Belajar "+ respon +" Sangat Mudah");
    }
}
