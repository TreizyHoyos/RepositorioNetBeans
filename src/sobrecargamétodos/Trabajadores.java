/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecargamétodos;

/**
 *
 * @author treiz
 */
public class Trabajadores 
{
    private String tipoDoc;
    private String NDoc; 
    private String paterno; 
    private String materno; 
    private String nombre;
    private String celular;
    private String correo;
    private String regimenLab;
    private String regimenPen;
    private String codigoInterno;
    
    // Atributo de clase para el último código generado
    private static int ultimoCodigo = 0;
    
    // Constructor sin parámetros
    
    public Trabajadores() { this.codigoInterno = generarCodigo(); }
    // Constructor con tipoDocumento "DNI" y régimen laboral "CAS"
    
    public Trabajadores(String numeroDocumento) {
    this.tipoDoc = "DNI"; this.regimenLab = "CAS"; this.NDoc = numeroDocumento; this.codigoInterno = generarCodigo();}
    
    // Método de clase para generar código correlativo
    private static String generarCodigo() {ultimoCodigo++; return String.format("T%05d", ultimoCodigo); }
    
}
