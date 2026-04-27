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
    
     // Getters y Setters con validación
    public String getTipoDocumento() {return tipoDoc;}
    public void setTipoDocumento(String tipoDocumento) 
    { if(tipoDocumento.equals("DNI") || tipoDocumento.equals("Carnet de Extranjería")) { this.tipoDoc = tipoDocumento; } 
    else { throw new IllegalArgumentException("Tipo de documento inválido. Debe ser 'DNI' o 'Carnet de Extranjería'."); }}
    public String getRegimenLaboral() { return regimenLab;}
    public void setRegimenLaboral(String regimenLaboral) {
        if(regimenLaboral.equals("CAS") || regimenLaboral.equals("276") || regimenLaboral.equals("728")) { this.regimenLab = regimenLaboral;} 
        else { throw new IllegalArgumentException("Régimen laboral inválido. Debe ser 'CAS', '276' o '728'.");} }
    public String getNumeroDocumento() { return NDoc; }
    public void setNumeroDocumento(String numeroDocumento) { this.NDoc = numeroDocumento; }
    public String getApellidoPaterno() { return paterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.paterno = apellidoPaterno; }
    public String getApellidoMaterno() { return materno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.materno = apellidoMaterno; }
    public String getNombres() {return nombre;}
    public void setNombres(String nombres) { this.nombre = nombres; }
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo;}
    public String getRegimenPensionario() { return regimenPen; }
    public void setRegimenPensionario(String regimenPensionario) { this.regimenPen = regimenPensionario; }
    public String getCodigoInterno() { return codigoInterno; } 
}
