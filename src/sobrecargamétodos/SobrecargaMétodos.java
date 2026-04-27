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
        
        System.out.println("Trabajador 1:");
        System.out.println("Codigo Interno: " + trabajador1.getCodigoInterno());
        System.out.println("Tipo Documento: " + trabajador1.getTipoDocumento());
        System.out.println("Numero Documento: " + trabajador1.getNumeroDocumento());
        System.out.println("Apellidos y Nombres: " + trabajador1.getApellidoPaterno() + " " +
                           trabajador1.getApellidoMaterno() + ", " + trabajador1.getNombres());
        System.out.println("Celular: " + trabajador1.getCelular());
        System.out.println("Correo: " + trabajador1.getCorreo());
        System.out.println("Regimen Laboral: " + trabajador1.getRegimenLaboral());
        System.out.println("Regimen Pensionario: " + trabajador1.getRegimenPensionario());
        System.out.println();

       
        System.out.println("Trabajador 2:");
        System.out.println("Codigo Interno: " + trabajador2.getCodigoInterno());
        System.out.println("Tipo Documento: " + trabajador2.getTipoDocumento());
        System.out.println("Numero Documento: " + trabajador2.getNumeroDocumento());
        System.out.println("Apellidos y Nombres: " + trabajador2.getApellidoPaterno() + " " +
                           trabajador2.getApellidoMaterno() + ", " + trabajador2.getNombres());
        System.out.println("Celular: " + trabajador2.getCelular());
        System.out.println("Correo: " + trabajador2.getCorreo());
        System.out.println("Regimen Laboral: " + trabajador2.getRegimenLaboral());
        System.out.println("Regimen Pensionario: " + trabajador2.getRegimenPensionario());
        
        System.out.println();

        System.out.println("Trabajador 3:");
        System.out.println("Codigo Interno: " + trabajador3.getCodigoInterno());
        System.out.println("Tipo Documento: " + trabajador3.getTipoDocumento());
        System.out.println("Numero Documento: " + trabajador3.getNumeroDocumento());
        System.out.println("Apellidos y Nombres: " + trabajador3.getApellidoPaterno() + " " +
                           trabajador3.getApellidoMaterno() + ", " + trabajador3.getNombres());
        System.out.println("Celular: " + trabajador3.getCelular());
        System.out.println("Correo: " + trabajador3.getCorreo());
        System.out.println("Regimen Laboral: " + trabajador3.getRegimenLaboral());
        System.out.println("Regimen Pensionario: " + trabajador3.getRegimenPensionario());
        
    }
    
}
