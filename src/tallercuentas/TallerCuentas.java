/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallercuentas;

import tallercuentas.Cuenta;
import tallercuentas.Utils;

/**
 *
 * @author Alejandro Sanchez Yalith Torres
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
        String[] opc = {"1 | Ingreso ",
            "2 | Egreso", "3 | Estado de Cuenta ", "4 | Salir"};
        // En la clase hay utilidades como print para printear en consola
        Utils u = new Utils();
        //Esta funcion hace un header 
        u.HeaderBonito("Taller");
        String Titular = u.ObtenerInputUsuario_string("Titular");
        //Obtengo por consola datos
        double Cantidad = u.ObtenerInputUsuario_double_novalid("Cantidad");
        //Instancio una cuenta nueva
        Cuenta acc = new Cuenta(Titular, Cantidad);
        //acc.SetCantidad(Cantidad);
        // u.Line dibuja una linea separadora en consola PD: es como un <hr>
        u.Line();
        // Printeo el titular por consola
        u.print("Titular: " + acc.GetTitular());
        u.print("Cantidad: " + acc.GetCantidad_String());

        boolean continuar = false;
        while (continuar == false) {
            u.Line();
            for (int i = 0; i < opc.length; i++) {
                String Element = opc[i];
                u.print(Element);
            }
            int selected = u.ObtenerInputUsuario_int("opcion");
            switch (selected) {
                case 1:
                    u.Line();
                    u.print(" Ingreso");
                    acc.Ingreso(u.ObtenerInputUsuario_double_novalid("Cantidad a Ingresar"));

                    break;
                case 2:
                    u.Line();
                    u.print(" Egreso Retiro");
                    acc.Retiro(u.ObtenerInputUsuario_double_novalid("Cantidad a egresar"));
                    break;
                case 3:
                    u.Line();
                    u.print("Resultados");
                    u.print("Titular: " + acc.GetTitular());
                    u.print("Cantidad: " + acc.GetCantidad_String());
                    break;
                case 4: 
                    continuar = true;
                    break;
            }
        }
    }
}
