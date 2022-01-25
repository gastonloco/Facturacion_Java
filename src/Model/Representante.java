package Model;
// Generated 11-22-2016 04:28:26 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Representante generated by hbm2java
 */
public class Representante  implements java.io.Serializable {


     private Integer idRepresentante;
     private Proveedor proveedor;
     private String nombre;
     private String apellido;
     private String direccion;
     private String telefono;
     private String numeroCedula;
     private Set compras = new HashSet(0);

    public Representante() {
    }

    public Representante(Proveedor proveedor, String nombre, String apellido, String direccion, String telefono, String numeroCedula, Set compras) {
       this.proveedor = proveedor;
       this.nombre = nombre;
       this.apellido = apellido;
       this.direccion = direccion;
       this.telefono = telefono;
       this.numeroCedula = numeroCedula;
       this.compras = compras;
    }
   
    public Integer getIdRepresentante() {
        return this.idRepresentante;
    }
    
    public void setIdRepresentante(Integer idRepresentante) {
        this.idRepresentante = idRepresentante;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNumeroCedula() {
        return this.numeroCedula;
    }
    
    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }
    public Set getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set compras) {
        this.compras = compras;
    }




}


