package tallercuentas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Utilidades de JAVA Alejandro Sanchez porteado de c++ programacion 1
 * https://github.com/AlePro12/InventarioProgramacion1/blob/main/ApFramework.h
 *
 * @author alejandrosanchez
 */
import java.util.*;

public class Utils {

    public Utils() {
    }

    /**
     * ObtenerInputUsuario_string
     *
     * @param title El titulo que tendra el input.
     * @return input
     */
    Scanner scan = new Scanner(System.in);

    public String ObtenerInputUsuario_string(String title) {
        //cout << " Ingrese " << title << ":";
        print(" Ingrese " + title + ":");
        String input = scan.next();
        return input;
    }
    
    public float ObtenerInputUsuario_float(String title) {
        float input;
        Boolean Valid = false;
        try {
            while (!Valid) {
                print(" Ingrese " + title + ":");

                input = scan.nextFloat();

                if (ValidarFloatPositivo(input)) {
                    Valid = true;
                    return input;
                } else {
                    Line();
                    print("ERROR: Numero Entero Invalido!");
                    print("Intenta nuevamente");
                    Line();
                }
            }
        } catch (Exception e) {
            print("error intentelo nuevamente");
            return ObtenerInputUsuario_float(title);
        }
        return 0;
    }
public double ObtenerInputUsuario_double_novalid(String title) {
        double input;
        print(" Ingrese " + title + ":");
        input = scan.nextDouble();
        return input;
    }

    public  int ObtenerInputUsuario_int(String title) {
        int input;
        Boolean Valid = false;
        try {
            while (!Valid) {
                print(" Ingrese " + title + ":");
                input = scan.nextInt();
                if (ValidarFloatPositivo(input)) {
                    Valid = true;
                    return input;
                } else {
                    Line();
                    print("ERROR: Numero Entero Invalido!");
                    print("Intenta nuevamente");
                    Line();
                }
            }
        } catch (Exception e) {
            print("error intentelo nuevamente");
            return ObtenerInputUsuario_int(title);
        }
        return 0;
    }

    public  Boolean ObtenerInputUsuario_bool(String title) {
        Boolean input;
        //cout << " Ingrese " << title << ":";
        print(" Ingrese " + title + ":");
        try {
            input = scan.nextBoolean();
        } catch (Exception e) {
            print("error intentelo nuevamente");
            return ObtenerInputUsuario_bool(title);
        }
        return input;
    }

    public  Boolean Pregunta(String title) {
        boolean input;
        print("" + title + "? ");
        print("0 => No.");
        print("1 => Si.");
        print("   - ");
        try {
            return intToboolean(scan.nextInt());
        } catch (Exception e) {
            print("error intentelo nuevamente");
            return Pregunta(title);
        }
    }

    // ==== Validaciones =====
    public static Boolean ValidarFloatPositivo(float value) {
        
        if (value >= 1) {
            return true;
        }
        return false;
    }

    public static Boolean ValidarEnteroPositivo(int value) {
        return value >= 0;
    }

    // ==== Conversiones ==== 
    public static float stringToFloat(String num) {
        return Float.parseFloat(num);
    }

    public static boolean intToboolean(int num) {
        if (num == 1) {
            return true;
        }
        return false;
    }

    public static String FloatToString(float num) {
        return Float.toString(num);
    }

    public static float stringToFloat_ConValidacion(String num) {
        return Float.parseFloat(num);
    }

    // ==== Diseno ====
    public static void HeaderBonito(String title) {
        float mid = (40 - (title.length() + 4)) / 2; // Aqui saco el calculo para ponerlo en el header
        print("|----------------------------------------|");
        print_noline("|");
        for (int i = 0; i < mid; i++) {
            print_noline("-");
        }
        print_noline("* " + title + " *");
        for (int i = 0; i < mid; i++) {
            print_noline("-");
        }
        print("|");
        print("|----------------------------------------|");

    }

    public static void Line() {
        print("----------------------------------------");
    }

    public static void print(String txt) {
        System.out.println(txt);
    }

    public static void print_noline(String txt) {
        System.out.print(txt);
    }
}
