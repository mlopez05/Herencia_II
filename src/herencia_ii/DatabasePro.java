/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_ii;

/**
 *
 * @author alumno
 */
public class DatabasePro extends Employee {
    
    private String databaseTool = "Database Performance Analyzer";

    @Override
    public String printData() {
        return super.printData()+ "\nDatabase Tool: " + databaseTool;
    }
    
    
}
