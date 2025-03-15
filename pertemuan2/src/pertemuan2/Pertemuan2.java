package pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Lendriana
 * TGL: 15 Maret 2025
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String mhs="Yulita Lendriana Dalian";
      long nim=2301010313L;
      String kelas="C";
      
      BufferedReader dtIN = new BufferedReader (new InputStreamReader (System.in));
      
      try{
         System.out.print ("Input Nama Mahasiswa:");
         mhs = dtIN.readLine(); 
         
         System.out.print ("Input NIM: ");
         nim = Long.parseLong( dtIN.readLine() );
         
      }catch (IOException e){
          System.out.println ("error");
          
      }
      
      kelas = JOptionPane.showInputDialog("Input Kelas: ");
      
      
      System.out.println("Data "+mhs+" dengan nim "+nim+"berada di kelas "+kelas);
    
    }
    
}
