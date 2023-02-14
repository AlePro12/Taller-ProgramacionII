/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercuentas;

import tallercuentas.Utils;
import java.io.IOException;

/**
 *
 * @author Alejandro Sanchez Yalith Torres
 */
public class Cuenta {
    // Privado por que solo se debe acceder a esta clase, no es protected tampoco por que 
    // Por ahora no esta planeado que estas variables lleguen a unas subclases
    private String Titular;
    private double Cantidad;
    private boolean CantidadSet = false;
    Utils u = new Utils();
    // CONSTRUCTORES
    public Cuenta(String Titular) {
        this(Titular, 0); 
    }
 
    public Cuenta(String Titular, double Cantidad) {
        this.Titular = Titular;
        //Cantidad es menor a 0, se coloca 0
        if (Cantidad < 0) {
            this.Cantidad = 0;
        } else {
            this.Cantidad = Cantidad;
        }
    }
    // METODOS
    //Data GET
    //Obtener Titular
    public String GetTitular() {
        return Titular;
    }
    // Obtener Cantidad 
    public double GetCantidad() {
        return Cantidad;
    }
    // Obtiene la cantidad en string
    public String GetCantidad_String() {
        return String.valueOf(Cantidad);
    }

    //Data Set
    // Set Titular
    public void SetTitular(String t) {
        if (t != "") {
            this.Titular = t;
        } else {
            throw new ArithmeticException("Error - El titular es requerido");
        };
    }
    // Set Cantidad
    public void SetCantidad(double c) {
        //segun yo la cantidad no se puede modificar si esta ya definida 
        // si se necesita modificar se utiliza el metodo RETIRAR
        if (CantidadSet == false) {
            this.SetCant(c);
        } else {
            throw new ArithmeticException("Error - No se puede editar la cantidad use el metodo RETIRAR");
        }
    }
    //Set Cantidad Privada solo se llama desde la misma clase
    private void SetCant(double c) {
        //uso interno 
        this.Cantidad = c;
        this.CantidadSet = true;
    }

    // Operaciones
    // Ingreso Cantidad a la Cuenta
    public void Ingreso(double Cant) {
        if (Cant > 0) {
            this.SetCant(this.Cantidad + Cant);
        } else {
            u.print("Warning - Cantidad Negativa no se hizo efecto");
        }
    }
    //Retiro o egreso Cantidad a la cuenta 
    public void Retiro(double Cant) {
        Double TotalCuenta = this.Cantidad + Cant;
        if (TotalCuenta > 0) {
            this.SetCant(TotalCuenta);
        } else {
            this.SetCant(0.00);
            this.Cantidad = 0.00;
        }
    }
}
