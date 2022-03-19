/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_ii;

/**
 *
 * @author alumno
 */
public class Herencia_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Programmer programmer = new Programmer();
        
        System.out.println(programmer.printData());
        
        DatabasePro databasepro = new DatabasePro();
        
        System.out.println(databasepro.printData());
    }
    
}
