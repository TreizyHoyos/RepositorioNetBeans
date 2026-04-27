/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecargamétodos;

/**
 *
 * @author treiz
 */
public class SobrecargaMétodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear un trabajador usando el constructor vacío
        Trabajadores trabajador1 = new Trabajadores();
        trabajador1.setTipoDocumento("DNI");
        trabajador1.setNumeroDocumento("60756421");
        trabajador1.setApellidoPaterno("Perez");
        trabajador1.setApellidoMaterno("Gomez");
        trabajador1.setNombres("Juan");
        trabajador1.setCelular("942369542");
        trabajador1.setCorreo("juan.perez@gmail.com");
        trabajador1.setRegimenLaboral("CAS");
        trabajador1.setRegimenPensionario("AFP");
        
        
    }
    
}
