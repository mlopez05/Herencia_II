/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_ii;

/**
 *
 * @author alumno
 */
public class Programmer extends Employee {
        
    private String language = "JavaScript";

    @Override
    public String printData() {
        return super.printData() + "\nLanguage: " + language; 
    }
    
    
}
