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
        
          // Crear un trabajador usando el constructor que inicializa tipoDocumento y regimenLaboral
        Trabajadores trabajador2 = new Trabajadores("60212168");
        trabajador2.setApellidoPaterno("Lopez");
        trabajador2.setApellidoMaterno("Ramirez");
        trabajador2.setNombres("Ana");
        trabajador2.setCelular("911982394");
        trabajador2.setCorreo("ana.lopez@gmail.com");
        trabajador2.setRegimenPensionario("ONP");
        
        Trabajadores trabajador3 = new Trabajadores("60212168");
        trabajador3.setApellidoPaterno("Servantes");
        trabajador3.setApellidoMaterno("Romero");
        trabajador3.setNombres("Miguel");
        trabajador3.setCelular("901922391");
        trabajador3.setCorreo("ana.lopez@gmail.com");
        trabajador3.setRegimenPensionario("ONP");
        
        
        
    }
    
}
