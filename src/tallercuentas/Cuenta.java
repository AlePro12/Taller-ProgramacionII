/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercuentas;

import tallercuentas.Utils;
import java.io.IOException;

/**
 *
 * @author Alejandro Sanchez
 *         Yalith Torres
 */
public class Cuenta {
    String Titular;
    Double Cantidad;
    Utils u = new Utils();
    // CONSTRUCTORES
    
    // METODOS
    //Data GET
    public String GetTitular(){
        return Titular;
    }
    public Double GetCantidad(){
        return Cantidad;
    }
    public String GetCantidadString(){
        return Cantidad.toString();
    }
    //Data Set
    public void SetTitular(String t ){
        this.Titular = t;
    }
    public void SetCantidad(Double c){
        //segun yo la cantidad no se puede modificar si esta ya definida 
        // si se necesita modificar se utiliza el metodo RETIRAR
        if(this.Cantidad == null){
            this.SetCant(c);
        }else{
            throw new ArithmeticException("Error - No se puede editar la cantidad use el metodo RETIRAR");
        }
    }
    private void SetCant(Double c){
        //uso interno 
        this.Cantidad = c;
    }
    // Operaciones
    public void Ingreso(Double Cant){
        if(Cant > 0 ){
            this.Cantidad += Cant;
        }else{
            u.print("Warning - Cantidad Negativa no se hizo efecto");
        }
    }
    public void Retiro(Double Cant){
        Double TotalCuenta = this.Cantidad+ Cant;
        if (TotalCuenta > 0){
            this.Cantidad = TotalCuenta;
        }else{
            this.Cantidad= 0.00;
        }
    }
}
