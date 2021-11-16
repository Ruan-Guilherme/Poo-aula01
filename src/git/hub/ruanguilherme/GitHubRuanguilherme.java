/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.hub.ruanguilherme;
import java.util.Scanner;
import javax.swing.JOptionPane;   
/**
 *
 * @author IFSC
 */
public class GitHubRuanguilherme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com seu nome");
        String nome = scanner.nextLine();
        System.out.println(nome+"bem vindo GitHub!");
       */ 
      String nome = JOptionPane.showInputDialog
        (null, "digite sue nome; ");
      JOptionPane.showMessageDialog
              (null, nome+" seja bem vindo ao GitHub");
      System.exit(0);
        
        
        
    }
    
}
