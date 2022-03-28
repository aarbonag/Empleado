/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aarbonag
 */
public class Empleado {
    String nombre;
    String apellido;
    double salarioMensual;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
    }
    
    public String getNombre(){
       return nombre;
   } 
   
   public void setNombre(String nuevoNombre){
       this.nombre = nuevoNombre;
   }
   
   public String getApellido(){
       return apellido;
   } 
   
   public void setApellido(String nuevoApellido){
       this.apellido = nuevoApellido;
   }
   
   public double getsalarioMensual(){
       return salarioMensual;
   } 
   
   public void setsalarioMensual(double nuevoSalarioMensual){
       this.salarioMensual = nuevoSalarioMensual;
   }
}


