/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercuentas;
import tallercuentas.Cuenta;
import tallercuentas.Utils;
/**
 *
 * @author Alejandro Sanchez
 *         Yalith Torres
 */

/*
Se desea crear una clase llamada CUENTA que tendra los siguentes attr: 
    * Titular (REQUIRED)
    * Cantidad(Float DOBLE) (OPCIONAL)
Crea dos _construct que cumpla lo anterior.

crea sus metodos GET, SET, ToString().
Tendra dos metodos ESPECIALES: 
    1. Ingresar CANTIDAD (Doble): 
        - Se Ingresa una cantidad a la cuenta, si la cantidad introduccida en negativa
        no se hara nada
    2. Retirar (DOBLE) cantidad: 
        - Se retira una cantidad a la cuenta, si restando la cantida actual a la que nos 
        pasan es negativa, la cantidad de la cuenta pasa a ser 0.
*/

public class TallerCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // En la clase hay utilidades como print para printear en consola
        Utils u = new Utils();
        //Esta funcion hace un header 
        u.HeaderBonito("Taller");
        //Instancio una cuenta nueva
        Cuenta acc = new Cuenta();
        //Obtengo por consola datos
        String Titular = u.ObtenerInputUsuario_string("Titular");
        double Cantidad = u.ObtenerInputUsuario_double_novalid("Cantidad");
        acc.SetTitular(Titular);
        acc.SetCantidad(Cantidad);
        // u.Line dibuja una linea separadora en consola PD: es como un <hr>
        u.Line();
        // Printeo el titular por consola
        u.print("Titular: "+ acc.GetTitular());
        u.print("Cantidad: "+ acc.GetCantidad_String());
        
        
    }
    
}
