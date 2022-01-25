package Model;
// Generated 11-22-2016 04:28:26 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String nombre;
     private String apellido;
     private String direccion;
     private String telefono;
     private Date fechaIngreso;
     private Boolean estado;
     private byte[] foto;
     private Set cedulas = new HashSet(0);
     private Set facturas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Cliente(String nombre, String apellido, String direccion, String telefono, Date fechaIngreso, Boolean estado, byte[] foto, Set cedulas, Set facturas) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.direccion = direccion;
       this.telefono = telefono;
       this.fechaIngreso = fechaIngreso;
       this.estado = estado;
       this.foto = foto;
       this.cedulas = cedulas;
       this.facturas = facturas;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public byte[] getFoto() {
        return this.foto;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public Set getCedulas() {
        return this.cedulas;
    }
    
    public void setCedulas(Set cedulas) {
        this.cedulas = cedulas;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}


